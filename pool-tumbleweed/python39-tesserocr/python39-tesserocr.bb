SUMMARY = "A Python wrapper around tesseract-ocr"
DESCRIPTION = "A wrapper around the tesseract-ocr API for Optical Character \
Recognition (OCR). \
 \
tesserocr integrates directly with Tesseract's C++ API using Cython \
which allows for Pythonic source code. It enables real concurrent \
execution when used with Python's threading module by releasing the \
GIL while processing an image in tesseract."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python39-tesserocr-2.6.0-2.3.aarch64.rpm"
RPM_HASH = "703cc63c7d5168ae6aba6b4fce6374db3551f710f975dc440fda63864af3a123900aa066c8c03d11e8a5b5278c6f101e8ff1b32fedce9875a01ee56327fad266"

RPROVIDES:${PN} += "python3.9dist-tesserocr \
python39-tesserocr \
python3dist-tesserocr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleptonica.so.6 \
libstdc++.so.6 \
libtesseract.so.5 \
python-abi \
tesseract-ocr-traineddata-english \
tesseract-ocr-traineddata-orientation-and-script-detection"

inherit rpm
