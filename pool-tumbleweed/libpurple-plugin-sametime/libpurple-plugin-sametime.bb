SUMMARY = "Sametime Plugin for Pidgin using the Meanwhile Library"
DESCRIPTION = "IBM Sametime plugin for Pidgin using the Meanwhile library."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple-plugin-sametime-2.14.12-1.3.aarch64.rpm"
RPM_HASH = "5cb232858dc908dfb8eb45e0d7a8644e76abf76e41cc54bd096abfa844aac73576ca67a0e9b033aef0f73317d9956a18da5eaaa2a04fcffd59f871690b877dad"

RPROVIDES:${PN} += "libpurple-meanwhile \
libpurple-plugin-sametime \
libpurple-plugin-sametime(aarch-64) \
libsametime.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libmeanwhile.so.1()(64bit) \
libpurple"

inherit rpm
