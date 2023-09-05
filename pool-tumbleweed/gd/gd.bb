SUMMARY = "A Drawing Library for Programs That Use PNG and JPEG Output"
DESCRIPTION = "Gd allows your code to quickly draw images complete with lines, arcs, \
text, and multiple colors. It supports cut and paste from other images \
and flood fills. It outputs PNG, JPEG, and WBMP (for wireless devices) \
and is supported by PHP."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "gd-2.3.3-3.5.aarch64.rpm"
RPM_HASH = "357f0b7fe6a7bcd019ed300537786fa63caf1288d44aaf7fe1c00f61aa44cfd4dfa116121f7bad722925bdb5fb048c83c737c9936154b72c81039f51d7918cc7"

RPROVIDES:${PN} += "gd \
gdlib"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3"

inherit rpm
