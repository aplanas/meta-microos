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

RPM_NAME = "python39-imread-0.7.4-3.11.aarch64.rpm"
RPM_HASH = "60e224eb4e27cbc45bfa312aec469447a6997ead24378c6f0364ec0b8b11a15be78002e0374362ad905a7cad0f4136001fd66e5b1ba0c99137dd3b245f5fad36"

RPROVIDES:${PN} += "python3.9dist-imread \
python39-imread \
python3dist-imread"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
python-abi \
python39-numpy"

inherit rpm
