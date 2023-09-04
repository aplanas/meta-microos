SUMMARY = "A MySQL and InnoDB monitor program"
DESCRIPTION = "Innotop is a powerful 'top' clone for MySQL. It connects to a MySQL database server \
and retrieves information from it, then displays it in a manner similar to the UNIX \
top program. Innotop uses the data from SHOW VARIABLES, SHOW GLOBAL STATUS, SHOW FULL \
PROCESSLIST, and SHOW ENGINE INNODB STATUS, among other things."
LICENSE = "GPL-2.0-only"

PV = "1.13.0"

RPM_NAME = "innotop-1.13.0-1.11.noarch.rpm"
RPM_HASH = "dc214954aac9fb3d572f832f98830b2f3ddbc1989b30147ddb561462172282364de77ecf0663cb099ee70fe01830d13cb157f9fb49111b23e902a6ff17c536a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "innotop"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.38.0 \
perl-DBD--mysql \
perl-DBI \
perl-File--Basename \
perl-File--Temp \
perl-Getopt--Long \
perl-List--Util \
perl-Term--ReadKey \
perl-Time--HiRes"

inherit rpm
