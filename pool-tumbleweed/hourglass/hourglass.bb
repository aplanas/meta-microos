SUMMARY = "Clock gadget for Elementary OS"
DESCRIPTION = "A clock application that is designed to fit perfectly into \
Elementary's design scheme."
LICENSE = "GPL-3.0-only"

PV = "2.0.2"

RPM_NAME = "hourglass-2.0.2-1.10.aarch64.rpm"
RPM_HASH = "4cd62d7d4f018770d177421ba8a55c96a7df7c247b027a5e47fd9bc004d8170dfc8565dc6de8eba761bf9d265861c2f66e3e874fd3c78c8fff9c60c1b04c6526"

RPROVIDES:${PN} += "hourglass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libhandy-1.so.0"

inherit rpm
