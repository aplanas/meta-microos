SUMMARY = "Python wrapper around the libevdev C library"
DESCRIPTION = "python-libevdev is a wrapper around the libevdev C library, with a \
pythonic API."
LICENSE = "MIT"

PV = "0.11"

RPM_NAME = "python310-libevdev-0.11-1.3.noarch.rpm"
RPM_HASH = "71f29bb842e8b996f770bce9e8297283f30d41c429ff10ccad5dabcc8e255c7c57bbc6584d43d66e7cc54cda0247fa384f9db8bbdfbab6dfea8f25f0d6b6baaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libevdev \
python3.10dist-libevdev \
python310-libevdev \
python3dist-libevdev"

RDEPENDS:${PN} += "libevdev2 \
python-abi"

inherit rpm
