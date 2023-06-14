SUMMARY = "A Drawing Library for Programs That Use PNG and JPEG Output"
DESCRIPTION = "Gd allows your code to quickly draw images complete with lines, arcs, \
text, and multiple colors. It supports cut and paste from other images \
and flood fills. It outputs PNG, JPEG, and WBMP (for wireless devices) \
and is supported by PHP."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "gd-2.3.3-3.3.aarch64.rpm"
RPM_HASH = "de9fb1d59fecee2be418b7ac211e840dcce4f121f3d42326dde03b63f1f31cfc573eb98dde6c760f41f32075d4c9ff6a9d00a69cfc342349bcdc28a5fdeb6fd4"

RPROVIDES:${PN} += "gd \
gdlib"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3"

inherit rpm
