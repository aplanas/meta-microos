SUMMARY = "Python wrapper for OCR engines"
DESCRIPTION = "PyOCR is an optical character recognition (OCR) tool wrapper for python. \
That is, it helps using various OCR tools from a Python program."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.3"

RPM_NAME = "python39-pyocr-0.8.3-1.3.noarch.rpm"
RPM_HASH = "eaadfde88c5f74d4663a4ec43d732ba8611ee90e995f639a179584a2682141ade27f66787e2df6e78b686125e8ad15be6aafc12b4ca59bb6c948e2d9eb1e47b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyocr) \
python39-pyocr \
python3dist(pyocr)"

RDEPENDS:${PN} += "python(abi) \
python39-Pillow"

inherit rpm
