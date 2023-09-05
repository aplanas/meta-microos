SUMMARY = "A Drawing Library for Programs That Use PNG and JPEG Output"
DESCRIPTION = "Gd allows your code to quickly draw images complete with lines, arcs, \
text, and multiple colors. It supports cut and paste from other images \
and flood fills. It outputs PNG, JPEG, and WBMP (for wireless devices) \
and is supported by PHP."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "libgd3-2.3.3-3.5.aarch64.rpm"
RPM_HASH = "4a94df526dc792a86128fe4c2b218aec228806c7abff99dec5a86461a0983728f4a0230413cbae1282a49433f723bda4cb190689b483aa63865c645f93f8ce3f"

RPROVIDES:${PN} += "libgd.so.3 \
libgd3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXpm.so.4 \
libavif.so.16 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7 \
libz.so.1"

inherit rpm
