SUMMARY = "The Facebook protocol plugin for bitlbee"
DESCRIPTION = "The Facebook protocol plugin for bitlbee. This plugin uses the Facebook Mobile API."
LICENSE = "GPL-2.0-only"

PV = "1.2.2+git.1614281748.a31ccbe"

RPM_NAME = "bitlbee-facebook-1.2.2+git.1614281748.a31ccbe-1.11.aarch64.rpm"
RPM_HASH = "73a76fb72ebcf12de8e0309745499c9cada4ed7002804524fa5fabe352a9f04b32ac77b7a4fc9d8600e5dfe9472b52c6a334c5841f042c2b295f0eb362b54c43"

RPROVIDES:${PN} += "bitlbee-facebook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
