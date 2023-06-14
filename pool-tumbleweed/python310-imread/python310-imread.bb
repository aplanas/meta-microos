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

RPM_NAME = "python310-imread-0.7.4-3.11.aarch64.rpm"
RPM_HASH = "11c6cdedb3db6b72c410fe028ade7bcd9e6e49a098932915352ad791425610cbe4424b29609ea23fda0ca2e23a5fa370c8b643d8dc9350845242632961f7f6df"

RPROVIDES:${PN} += "python3-imread \
python3.10dist-imread \
python310-imread \
python3dist-imread"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
python-abi \
python310-numpy"

inherit rpm
