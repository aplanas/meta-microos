SUMMARY = "Image reading library"
DESCRIPTION = "Mahotas-imread is a simple module with a small number of functions: \
 \
imread \
    Reads an image file \
imread_multi \
    Reads an image file with multiple images. Currently, TIFF and STK (a TIFF \
    sub-based format) support this function. \
imsave \
    Writes an image file"
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python311-imread-0.7.4-3.11.aarch64.rpm"
RPM_HASH = "88e17b905711395a05fe9f8d6b1fc15005e22c381f9acf3ea0aadfca34981c6bf3bcac9a83d0a6dda41e5009572f14bdbb46a471d03e2b70291122b805f0d158"

RPROVIDES:${PN} += "python3.11dist(imread) \
python311-imread \
python311-imread(aarch-64) \
python3dist(imread)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
python(abi) \
python311-numpy"

inherit rpm
