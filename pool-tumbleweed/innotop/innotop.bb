SUMMARY = "A MySQL and InnoDB monitor program"
DESCRIPTION = "Innotop is a powerful 'top' clone for MySQL. It connects to a MySQL database server \
and retrieves information from it, then displays it in a manner similar to the UNIX \
top program. Innotop uses the data from SHOW VARIABLES, SHOW GLOBAL STATUS, SHOW FULL \
PROCESSLIST, and SHOW ENGINE INNODB STATUS, among other things."
LICENSE = "GPL-2.0-only"

PV = "1.13.0"

RPM_NAME = "innotop-1.13.0-1.9.noarch.rpm"
RPM_HASH = "54bcb2763d79df65fc18a29dea508d86282f332e42511d2a2aaf9a83dae66ef68d3e41fc0292a8601b1e36aac22ef9175468328296b96680dbd28fa9f1993163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "innotop"
RDEPENDS:${PN} += "/usr/bin/env \
perl(:MODULE_COMPAT_5.36.0) \
perl(DBD::mysql) \
perl(DBI) \
perl(File::Basename) \
perl(File::Temp) \
perl(Getopt::Long) \
perl(List::Util) \
perl(Term::ReadKey) \
perl(Time::HiRes)"

inherit rpm
