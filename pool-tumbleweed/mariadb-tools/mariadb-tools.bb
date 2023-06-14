SUMMARY = "MariaDB tools"
DESCRIPTION = "A set of scripts for administering a MariaDB or developing \
applications with MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.3"

RPM_NAME = "mariadb-tools-10.11.3-1.1.aarch64.rpm"
RPM_HASH = "53d37547b7e1a3d06f77cef88759c237130d9b132e5805846df8d62514ef33b8b3c57188ab6e69b852340be3d914843583e2ab4798a2b7348276a6c86e92a6a8"

RPROVIDES:${PN} += "mariadb-tools \
mysql-/usr/bin/mysqlhotcopy \
mysql-client-/usr/bin/perror \
mysql-tools"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libncurses.so.6 \
libpcre2-8.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1 \
perl-DBD-mysql"

inherit rpm
