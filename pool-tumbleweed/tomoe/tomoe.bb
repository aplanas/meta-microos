SUMMARY = "Japanese handwriting recognition engine"
DESCRIPTION = "Japanese handwriting recognition engine (Tegaki Online MOji-ninshiki \
Engine)"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "tomoe-0.6.0-51.4.aarch64.rpm"
RPM_HASH = "65c80a305ba41396a25b88559c07526cb336ed9e549fb64f3c999f434fd9b0d404f859a472983155152d273986653ce62eccc03dff1525df1c77512585cd548e"

RPROVIDES:${PN} += "libtomoe.so.0()(64bit) \
tomoe \
tomoe(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
