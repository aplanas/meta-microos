SUMMARY = "Python module for GNU parted"
DESCRIPTION = "Python module for the parted library.  It is used for manipulating \
partition tables."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.0"

RPM_NAME = "python311-parted-3.12.0-3.1.aarch64.rpm"
RPM_HASH = "d745feb1a11c4e808ed6ed4c142d9844ddb7e905708279e74553d010794b4ffde6bb857a031b6cd1024998ef9aa8d062ba884b511aba3e30bc86f2a96a7b0986"

RPROVIDES:${PN} += "python3.11dist-pyparted \
python311-parted \
python3dist-pyparted"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libparted.so.2 \
parted \
python-abi"

inherit rpm
