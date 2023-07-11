SUMMARY = "Python wrapper for OCR engines"
DESCRIPTION = "PyOCR is an optical character recognition (OCR) tool wrapper for python. \
That is, it helps using various OCR tools from a Python program."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.3"

RPM_NAME = "python39-pyocr-0.8.3-1.5.noarch.rpm"
RPM_HASH = "6a58ca21a336c79b57696b6547a0b06c623de819bd09fd7e93680827360ff96deb94bf12777503db538f328beb2f3f1c9a325d82d9b0420950a66986cb678e13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyocr \
python39-pyocr \
python3dist-pyocr"

RDEPENDS:${PN} += "python-abi \
python39-Pillow"

inherit rpm
