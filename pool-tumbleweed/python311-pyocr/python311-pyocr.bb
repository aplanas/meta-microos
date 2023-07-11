SUMMARY = "Python wrapper for OCR engines"
DESCRIPTION = "PyOCR is an optical character recognition (OCR) tool wrapper for python. \
That is, it helps using various OCR tools from a Python program."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.3"

RPM_NAME = "python311-pyocr-0.8.3-1.5.noarch.rpm"
RPM_HASH = "510cbf7c1c053bedfc075ce92a81509beafdcac74abc16d8a437ac03b7d8f5e2097bc4daa19e051407d585c16e0ce383400e031b79d7a5c9c7c1a870db67801e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyocr \
python3.11dist-pyocr \
python311-pyocr \
python3dist-pyocr"

RDEPENDS:${PN} += "python-abi \
python311-Pillow"

inherit rpm
