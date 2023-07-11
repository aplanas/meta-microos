SUMMARY = "A Drawing Library for Programs That Use PNG and JPEG Output"
DESCRIPTION = "Gd allows your code to quickly draw images complete with lines, arcs, \
text, and multiple colors. It supports cut and paste from other images \
and flood fills. It outputs PNG, JPEG, and WBMP (for wireless devices) \
and is supported by PHP."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "libgd3-2.3.3-3.4.aarch64.rpm"
RPM_HASH = "62d72eb20dc1e77107f0b0a5c35620aee60bd8f190c493d974ea69c14de3082ac4ec0d41636dd333c6fe93a7385140dec37126ec825e2278c6a7d957739dacf7"

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
