SUMMARY = "Client for MariaDB"
DESCRIPTION = "This package contains the standard clients for MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "11.0.2"

RPM_NAME = "mariadb-client-11.0.2-1.1.aarch64.rpm"
RPM_HASH = "84bd9109d093a63a9a1907db14db0ac7200ada96bd58852f7016ae0b6d29d7348b4a2eeeb720fba25b2da1cf31f08aaa15df4a2a00600e3112df7992ef61f4e4"

RPROVIDES:${PN} += "config-mariadb-client \
group-mysql \
mariadb-client \
mysql-client \
user-mysql"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libedit.so.0 \
libgcc-s.so.1 \
libmariadb3 \
libncurses.so.6 \
libssl.so.3 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1 \
mariadb-errormessages \
sysuser-shadow"

inherit rpm
