SUMMARY = "A module to control the request handling in lighttpd"
DESCRIPTION = "A module to control the request handling in lighttpd. \
 \
It is the successor of mod_cml."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_magnet-1.4.71-1.2.aarch64.rpm"
RPM_HASH = "3dee7aa3fe22549b3a375d5796064be398e0882a5dd0949b71b19315778d846a456788bd643dadf8a4ce1d34e897751d8c72a7d85f2c04de5dabbc297a3e8449"

RPROVIDES:${PN} += "config-lighttpd-mod-magnet \
lighttpd-mod-magnet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblua5.1.so.5 \
lighttpd"

inherit rpm
