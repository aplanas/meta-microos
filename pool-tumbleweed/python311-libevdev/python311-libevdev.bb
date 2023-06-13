SUMMARY = "Python wrapper around the libevdev C library"
DESCRIPTION = "python-libevdev is a wrapper around the libevdev C library, with a \
pythonic API."
LICENSE = "MIT"

PV = "0.11"

RPM_NAME = "python311-libevdev-0.11-1.3.noarch.rpm"
RPM_HASH = "3ba9d8db295fdb2f7d1a4765e83c18631d43db7c9a4288c1561d44fc62fdaf8b5e02ab91fceb9e6a8fbb783e80a06655c75d49246ab689a311ed5ba8f2f34b98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(libevdev) \
python311-libevdev \
python3dist(libevdev)"

RDEPENDS:${PN} += "libevdev2 \
python(abi)"

inherit rpm
