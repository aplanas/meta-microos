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

RPM_NAME = "python39-pytesseract-0.3.10-1.5.noarch.rpm"
RPM_HASH = "7e7a00fe1f32af538045acc5f3da59d3d0ad622ea3b8d3c6cadd0d3d646b4a0e065af19d187e28efa1b532fe1f96add981f289196908a9f6b6c9b1513777caf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytesseract) \
python39-pytesseract \
python3dist(pytesseract)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
pkgconfig(tesseract) \
python(abi) \
python39-Pillow \
python39-setuptools \
tesseract-ocr-traineddata-deu \
tesseract-ocr-traineddata-eng \
update-alternatives"

inherit rpm
