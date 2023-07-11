SUMMARY = "Python wrapper around the libevdev C library"
DESCRIPTION = "python-libevdev is a wrapper around the libevdev C library, with a \
pythonic API."
LICENSE = "MIT"

PV = "0.11"

RPM_NAME = "python310-libevdev-0.11-1.5.noarch.rpm"
RPM_HASH = "34eeee237dcd3ef4677b8566940b67a078edb40a762ffa873db98992ae432fcf08f979e5b9c874d299a18e1bc134027094901f38fbfda352ebedafdef9bb8a45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-libevdev \
python310-libevdev \
python3dist-libevdev"

RDEPENDS:${PN} += "libevdev2 \
python-abi"

inherit rpm
