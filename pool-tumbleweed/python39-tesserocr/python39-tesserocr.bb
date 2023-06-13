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

RPM_NAME = "python39-tesserocr-2.6.0-1.4.aarch64.rpm"
RPM_HASH = "76eceab5e1be012d2e92c9b5a04c2127c87dd81e78466c5b15af5af6bf285d83fe675e706d72a37cd522d30dab04827f35454fafe6122f12dbf0ce94040d6856"

RPROVIDES:${PN} += "python3.9dist(tesserocr) \
python39-tesserocr \
python39-tesserocr(aarch-64) \
python3dist(tesserocr)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleptonica.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtesseract.so.5.3.0()(64bit) \
python(abi) \
tesseract-ocr-traineddata-english \
tesseract-ocr-traineddata-orientation_and_script_detection"

inherit rpm
