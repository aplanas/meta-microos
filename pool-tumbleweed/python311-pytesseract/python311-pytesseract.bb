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

RPM_NAME = "python311-pytesseract-0.3.10-1.5.noarch.rpm"
RPM_HASH = "a2aae444f1cc0feb6e13ff58c0d236641f8b13699c945e91e79cc80839a313314e938d2d9934d59cb5bfac1489f49103cf5b57a454f9574973e8d80bb2340bf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytesseract \
python311-pytesseract \
python3dist-pytesseract"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
pkgconfig-tesseract \
python-abi \
python311-Pillow \
python311-setuptools \
tesseract-ocr-traineddata-deu \
tesseract-ocr-traineddata-eng \
update-alternatives"

inherit rpm
