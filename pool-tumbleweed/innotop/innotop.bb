SUMMARY = "A MySQL and InnoDB monitor program"
DESCRIPTION = "Innotop is a powerful 'top' clone for MySQL. It connects to a MySQL database server \
and retrieves information from it, then displays it in a manner similar to the UNIX \
top program. Innotop uses the data from SHOW VARIABLES, SHOW GLOBAL STATUS, SHOW FULL \
PROCESSLIST, and SHOW ENGINE INNODB STATUS, among other things."
LICENSE = "GPL-2.0-only"

PV = "1.13.0"

RPM_NAME = "innotop-1.13.0-1.10.noarch.rpm"
RPM_HASH = "d3594ab091fb9dd9c1eebf674caf2d9771cfb4b943c305fe9bafaa8dffe8f7c3d490e70bf461ee37843f8be104b18054ae6b1374f887a9dc67ab7011c1f74711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "innotop"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.36.1 \
perl-DBD--mysql \
perl-DBI \
perl-File--Basename \
perl-File--Temp \
perl-Getopt--Long \
perl-List--Util \
perl-Term--ReadKey \
perl-Time--HiRes"

inherit rpm
