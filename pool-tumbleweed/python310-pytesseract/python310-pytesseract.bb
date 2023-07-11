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

RPM_NAME = "python310-pytesseract-0.3.10-1.7.noarch.rpm"
RPM_HASH = "deea5d07c9683734f9da57a2a500ca426d4aa20dd2434f28813dc70d9144cc8272b2a630fe763935001dab76d50f2d230f601c69db609bc1eb3cc742997c076f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytesseract \
python310-pytesseract \
python3dist-pytesseract"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
pkgconfig-tesseract \
python-abi \
python310-Pillow \
python310-setuptools \
tesseract-ocr-traineddata-deu \
tesseract-ocr-traineddata-eng \
update-alternatives"

inherit rpm
