SUMMARY = "Python wrapper for OCR engines"
DESCRIPTION = "PyOCR is an optical character recognition (OCR) tool wrapper for python. \
That is, it helps using various OCR tools from a Python program."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.3"

RPM_NAME = "python310-pyocr-0.8.3-1.5.noarch.rpm"
RPM_HASH = "40dc01bd75ddc664238b218b7a11a9cd989e874d0e6724c84a199bdc4825cdc3b7cb2ae27e3467a0d82ac350ef15e16106f9dca98e12f7bb8a2a65d652f6d6ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyocr \
python310-pyocr \
python3dist-pyocr"

RDEPENDS:${PN} += "python-abi \
python310-Pillow"

inherit rpm
