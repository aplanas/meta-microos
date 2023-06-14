SUMMARY = "Client for MariaDB"
DESCRIPTION = "This package contains the standard clients for MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.3"

RPM_NAME = "mariadb-client-10.11.3-1.1.aarch64.rpm"
RPM_HASH = "6907c6bd6414f8bbaa01ce1fc93f9132edafc95527f8817c3e92ede0225cb121a271794a137b8f99493071bb7382910f74cd80f93a75b717db026e77a1a24377"

RPROVIDES:${PN} += "config-mariadb-client \
group-mysql \
mariadb-client \
mysql-client \
user-mysql"

RDEPENDS:${PN} += "/bin/sh \
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
