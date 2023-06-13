SUMMARY = "Steam plugin for libpurple"
DESCRIPTION = "Adds support for Steam to Pidgin, Adium, Finch and other libpurple \
based messengers."
LICENSE = "GPL-3.0+"

PV = "1.6.1"

RPM_NAME = "libpurple-plugin-libsteam-1.6.1-2.27.aarch64.rpm"
RPM_HASH = "485df09af8dda1414da67417928664d4b3d65e2f9df61ff07ce24aec27e5c440fe2550db5d9ec8ad69270e8eccec214a57f33f471be87cc5005d7524fc04518b"

RPROVIDES:${PN} += "libpurple-plugin-libsteam \
libpurple-plugin-libsteam(aarch-64) \
libsteam.so()(64bit) \
purple-libsteam"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libnss3.so()(64bit) \
libpurple.so.0()(64bit)"

inherit rpm
