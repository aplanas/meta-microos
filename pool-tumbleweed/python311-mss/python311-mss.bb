SUMMARY = "Python multiple screenshots module"
DESCRIPTION = "An ultra fast cross-platform multiple screenshots module in pure Python using ctypes."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "python311-mss-7.0.1-1.6.noarch.rpm"
RPM_HASH = "f317e21914201ccdda2f9243c5a9583eed5477dc97070d5104ca4d27a644e0632623531342c7ab3ccac3f5acf9b474208be6acc587e93e36dafa9cb9d2323d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mss \
python3.11dist-mss \
python311-mss \
python3dist-mss"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives \
xrandr"

inherit rpm
