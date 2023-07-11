SUMMARY = "Benchmarks for MariaDB"
DESCRIPTION = "This package contains benchmark scripts and data for MariaDB. \
 \
To run these database benchmarks, start the script 'run-all-tests' in \
the directory /usr/share/sql-bench after starting MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "11.0.2"

RPM_NAME = "mariadb-bench-11.0.2-1.1.aarch64.rpm"
RPM_HASH = "e514512b2fcb600a20fe15110f4d2709a6c4c7b1ab74d62c260d4a038692933de4c43d0c3420760b1e8000035644ee4c0e998dd1fcf1335db8889675c8e69a58"

RPROVIDES:${PN} += "mariadb-bench \
mysql-bench"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1 \
mariadb-client \
perl-DBD-mysql"

inherit rpm
