SUMMARY = "Plymouth graphics libraries"
DESCRIPTION = "This package contains the libply-splash-graphics library \
used by graphical Plymouth splashes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-splash-graphics5-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "f059db8dcbc4779a956f77de0ee325ab80639c3001d1970300a55a161b4a32b67121a190e73bba3bb59ec74ce44d9e0a402e6497b14fc608cd001e3d9d3f1d7b"

RPROVIDES:${PN} += "libply-splash-graphics.so.5 \
libply-splash-graphics5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply.so.5 \
libpng16.so.16"

inherit rpm
