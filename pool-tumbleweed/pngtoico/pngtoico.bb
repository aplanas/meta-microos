SUMMARY = "Utility to convert PNG images to Microsoft ICO format"
DESCRIPTION = "pngtoico is a small utility to convert a set of PNG images to Microsoft \
ICO format. Supports transparency."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "pngtoico-1.0.1-145.9.aarch64.rpm"
RPM_HASH = "a7103050bdb88dcee9efc7243bd045dcc546be1e727476909b1b103bff3a55cbe2246c7fd777034b7466c4423b7ddf27118a18654eee3105078513a594dd09e3"

RPROVIDES:${PN} += "pngtoico \
pngtoico(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
