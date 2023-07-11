SUMMARY = "Simple GObject-based library to parse playlist formats"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "xplayer-plparser-1.0.2-2.13.aarch64.rpm"
RPM_HASH = "fb340cbfe41fe0e0ffe04e7689383185acd657b8a9ec6af0619234022881a5f1bfe6ee3bb7e9209b2a3ca3e7ce60a29718484925e86d202292e75cf02f1b997a"

RPROVIDES:${PN} += "xplayer-plparser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libquvi-0.9-0.9.4.so \
libquvi-scripts"

inherit rpm
