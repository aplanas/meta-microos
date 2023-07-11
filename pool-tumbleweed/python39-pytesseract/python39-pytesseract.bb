SUMMARY = "Python wrapper for Google's Tesseract-OCR"
DESCRIPTION = "Python-tesseract is an optical character recognition (OCR) tool for Python, \
that is, it will recognize and 'read' the text embedded in images. \
 \
Python-tesseract is a wrapper for Google's Tesseract-OCR Engine. It can be used \
as a stand-alone invocation script to tesseract, as it can read all image types \
supported by the Python Imaging Library, including JPEG, PNG, GIF, BMP, TIFF, \
and others, whereas tesseract-ocr, by default, only supports TIFF and BMP. \
Additionally, if used as a script, python-tesseract will print the recognized \
text instead of writing it to a file. There is no support for confidence estimates and \
bounding box data is planned for future releases."
LICENSE = "Apache-2.0"

PV = "0.3.10"

RPM_NAME = "python39-pytesseract-0.3.10-1.7.noarch.rpm"
RPM_HASH = "f5a3e367cb090e847ab1f37d888420135384c2143bdec5551644649a0e084bb2d7a9a6662ec6cb54aceb09a6d39e312a96f7f0eb4a0922ef9d61ad12e0713996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytesseract \
python39-pytesseract \
python3dist-pytesseract"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
pkgconfig-tesseract \
python-abi \
python39-Pillow \
python39-setuptools \
tesseract-ocr-traineddata-deu \
tesseract-ocr-traineddata-eng \
update-alternatives"

inherit rpm
