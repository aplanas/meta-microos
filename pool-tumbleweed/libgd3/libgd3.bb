SUMMARY = "A Drawing Library for Programs That Use PNG and JPEG Output"
DESCRIPTION = "Gd allows your code to quickly draw images complete with lines, arcs, \
text, and multiple colors. It supports cut and paste from other images \
and flood fills. It outputs PNG, JPEG, and WBMP (for wireless devices) \
and is supported by PHP."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "libgd3-2.3.3-3.3.aarch64.rpm"
RPM_HASH = "9364e92a5dd59a5181952fe9426b92cd333f65c7ccb8adb69122e094d4829c7ea18b2d0d5b5533884036ecfcd08cd7d267eaef6ec05ef9e7f9d84f4a54b49e8c"

RPROVIDES:${PN} += "libgd.so.3()(64bit) \
libgd3 \
libgd3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libXpm.so.4()(64bit) \
libavif.so.15()(64bit) \
libc.so.6()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit) \
libwebp.so.7()(64bit) \
libz.so.1()(64bit)"

inherit rpm
