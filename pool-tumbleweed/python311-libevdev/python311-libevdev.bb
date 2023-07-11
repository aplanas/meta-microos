SUMMARY = "Python wrapper around the libevdev C library"
DESCRIPTION = "python-libevdev is a wrapper around the libevdev C library, with a \
pythonic API."
LICENSE = "MIT"

PV = "0.11"

RPM_NAME = "python311-libevdev-0.11-1.5.noarch.rpm"
RPM_HASH = "c1b977b1a9ef5bf7a794ff93a34039093525ff425002f57c780f74fd4c9b59a72a21c04f6dd273973ce1909026d022825c716dc1e17c92e2a77566a823e644ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libevdev \
python3.11dist-libevdev \
python311-libevdev \
python3dist-libevdev"

RDEPENDS:${PN} += "libevdev2 \
python-abi"

inherit rpm
