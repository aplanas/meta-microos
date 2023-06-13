SUMMARY = "X BrlAPI helper"
DESCRIPTION = "The xbrlapi utility is a helper to have BrlAPI work on a X system."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "xbrlapi-6.5-2.4.aarch64.rpm"
RPM_HASH = "b33e9e58e5021fd59110e046b6fd930631c9845b78692c75487acff3b10764ca6c34f70f8d412eca3ac515ef7388334a9b4fa0c63578430fea66c02598d0eeb1"

RPROVIDES:${PN} += "xbrlapi \
xbrlapi(aarch-64)"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXtst.so.6()(64bit) \
libbrlapi.so.0.8()(64bit) \
libc.so.6()(64bit) \
libicuuc.so.73()(64bit)"

inherit rpm
