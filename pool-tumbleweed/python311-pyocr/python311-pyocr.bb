SUMMARY = "Python wrapper for OCR engines"
DESCRIPTION = "PyOCR is an optical character recognition (OCR) tool wrapper for python. \
That is, it helps using various OCR tools from a Python program."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.3"

RPM_NAME = "python311-pyocr-0.8.3-1.3.noarch.rpm"
RPM_HASH = "52f0984842bc23ca8eec93cdb1d641811584901ba81f79bbb47528c2dc0382f07968738948bdf2570299dbfca17d8e11ac266f2dbad0802fdd7cd6d28dbfea37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyocr) \
python311-pyocr \
python3dist(pyocr)"

RDEPENDS:${PN} += "python(abi) \
python311-Pillow"

inherit rpm
