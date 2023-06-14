SUMMARY = "A module to control the request handling in lighttpd"
DESCRIPTION = "A module to control the request handling in lighttpd. \
 \
It is the successor of mod_cml."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_magnet-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "bb1b7fd71dfa3fd70abec7435129fa63d4ad7ab2afa6a274f76999a8a03fc23417a5694dd70cea36eb121d6bc5fc324300c3fe09aa54e856d27e8be503a65fff"

RPROVIDES:${PN} += "config-lighttpd-mod-magnet \
lighttpd-mod-magnet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblua5.1.so.5 \
lighttpd"

inherit rpm
