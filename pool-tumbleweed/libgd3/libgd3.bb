SUMMARY = "A Drawing Library for Programs That Use PNG and JPEG Output"
DESCRIPTION = "Gd allows your code to quickly draw images complete with lines, arcs, \
text, and multiple colors. It supports cut and paste from other images \
and flood fills. It outputs PNG, JPEG, and WBMP (for wireless devices) \
and is supported by PHP."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "libgd3-2.3.3-3.3.aarch64.rpm"
RPM_HASH = "9364e92a5dd59a5181952fe9426b92cd333f65c7ccb8adb69122e094d4829c7ea18b2d0d5b5533884036ecfcd08cd7d267eaef6ec05ef9e7f9d84f4a54b49e8c"

RPROVIDES:${PN} += "libgd.so.3 \
libgd3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXpm.so.4 \
libavif.so.15 \
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
