SUMMARY = "A Drawing Library for Programs That Use PNG and JPEG Output"
DESCRIPTION = "Gd allows your code to quickly draw images complete with lines, arcs, \
text, and multiple colors. It supports cut and paste from other images \
and flood fills. It outputs PNG, JPEG, and WBMP (for wireless devices) \
and is supported by PHP."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "gd-2.3.3-3.4.aarch64.rpm"
RPM_HASH = "9fb2045fc69920d4777c6260c52cf5c8d6af97ad00a8ca32801cacb1e1a72cbca60d6b45cb18924c053b4bce96a30db8afff0c4f9f2484ee31eaa3fb59819c39"

RPROVIDES:${PN} += "gd \
gdlib"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3"

inherit rpm
