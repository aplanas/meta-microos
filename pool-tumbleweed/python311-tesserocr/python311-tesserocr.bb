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

RPM_NAME = "python311-tesserocr-2.6.0-2.3.aarch64.rpm"
RPM_HASH = "f7c9f934217c6a34c6418f042074805c20586dbb87a0fdd4d77b492b64bf5a8c07bbf5b73dcd127017bbf4b524505ab1a6209cc9dd0c64d58536721ee81cf513"

RPROVIDES:${PN} += "python3-tesserocr \
python3.11dist-tesserocr \
python311-tesserocr \
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
