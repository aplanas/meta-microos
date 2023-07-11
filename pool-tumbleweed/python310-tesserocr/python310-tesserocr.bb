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

RPM_NAME = "python310-tesserocr-2.6.0-2.3.aarch64.rpm"
RPM_HASH = "7d95c61be95ea58e67dd354dd2b1ca8db1af56e6e9e2db1f788e72ffe6ced74866e3118aa6f3840b9b5992871b6cb45e7fc84417d4aa524964e4a16f7d449e89"

RPROVIDES:${PN} += "python3.10dist-tesserocr \
python310-tesserocr \
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
