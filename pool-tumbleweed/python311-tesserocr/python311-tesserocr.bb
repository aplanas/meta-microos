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

RPM_NAME = "python311-tesserocr-2.6.0-1.4.aarch64.rpm"
RPM_HASH = "4c4c0bdd4bc245d99815555ec0717c9a4069dae01c9139ec7c31f7ab0422a4068044f37d539390efbbdf462b72f493494413dab7a64fe7efe914517d9059fd9d"

RPROVIDES:${PN} += "python3.11dist-tesserocr \
python311-tesserocr \
python3dist-tesserocr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleptonica.so.6 \
libstdc++.so.6 \
libtesseract.so.5.3.0 \
python-abi \
tesseract-ocr-traineddata-english \
tesseract-ocr-traineddata-orientation-and-script-detection"

inherit rpm
