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

RPM_NAME = "python310-pytesseract-0.3.10-1.5.noarch.rpm"
RPM_HASH = "3fc1656727d8e6af73a5aa61d01d5445e96e7d35797baee50d685d074764ec2ba23061be1b5af5f70bf0898b6e078013d55cf2ae4428b7a6fade236a7fdbb585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytesseract \
python3.10dist(pytesseract) \
python310-pytesseract \
python3dist(pytesseract)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
pkgconfig(tesseract) \
python(abi) \
python310-Pillow \
python310-setuptools \
tesseract-ocr-traineddata-deu \
tesseract-ocr-traineddata-eng \
update-alternatives"

inherit rpm
