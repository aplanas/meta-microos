SUMMARY = "Python wrapper around the libevdev C library"
DESCRIPTION = "python-libevdev is a wrapper around the libevdev C library, with a \
pythonic API."
LICENSE = "MIT"

PV = "0.11"

RPM_NAME = "python39-libevdev-0.11-1.3.noarch.rpm"
RPM_HASH = "4769b9e61590112e2316373e3176d8c0a309f1426b1ff16c37ecb51516f63a996b4967171881871fed3d8656c13494b248b3b89af5894e273a3c483ee6be338e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-libevdev \
python39-libevdev \
python3dist-libevdev"

RDEPENDS:${PN} += "libevdev2 \
python-abi"

inherit rpm
