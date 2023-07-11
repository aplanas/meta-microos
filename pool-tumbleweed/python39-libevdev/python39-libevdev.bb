SUMMARY = "Python wrapper around the libevdev C library"
DESCRIPTION = "python-libevdev is a wrapper around the libevdev C library, with a \
pythonic API."
LICENSE = "MIT"

PV = "0.11"

RPM_NAME = "python39-libevdev-0.11-1.5.noarch.rpm"
RPM_HASH = "eb586a597feb05854aae5655a5eb355c4c773760f8265d97568170e6493865d08230cbe090c6e3e8c622f665129277805a773ae008f749372f966bbca437560e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-libevdev \
python39-libevdev \
python3dist-libevdev"

RDEPENDS:${PN} += "libevdev2 \
python-abi"

inherit rpm
