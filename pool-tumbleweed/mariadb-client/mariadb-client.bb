SUMMARY = "Client for MariaDB"
DESCRIPTION = "This package contains the standard clients for MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.3"

RPM_NAME = "mariadb-client-10.11.3-1.1.aarch64.rpm"
RPM_HASH = "6907c6bd6414f8bbaa01ce1fc93f9132edafc95527f8817c3e92ede0225cb121a271794a137b8f99493071bb7382910f74cd80f93a75b717db026e77a1a24377"

RPROVIDES:${PN} += "config(mariadb-client) \
group(mysql) \
mariadb-client \
mariadb-client(aarch-64) \
mysql-client \
user(mysql)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libedit.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libmariadb3 \
libncurses.so.6()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libz.so.1()(64bit) \
mariadb-errormessages \
sysuser-shadow"

inherit rpm
