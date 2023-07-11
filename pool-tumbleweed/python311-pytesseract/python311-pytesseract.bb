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

RPM_NAME = "python311-pytesseract-0.3.10-1.7.noarch.rpm"
RPM_HASH = "9bb94e3b028f508938a0f0062cdcc1fe6a6ddd9896d642598d6a92d9b303939dacf8ddbf03ea357269f6c1aa2dfc8b29663ffe4ba45e2b2ff66e251f31a471b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytesseract \
python3.11dist-pytesseract \
python311-pytesseract \
python3dist-pytesseract"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
pkgconfig-tesseract \
python-abi \
python311-Pillow \
python311-setuptools \
tesseract-ocr-traineddata-deu \
tesseract-ocr-traineddata-eng \
update-alternatives"

inherit rpm
