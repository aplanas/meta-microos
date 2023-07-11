SUMMARY = "Python module for GNU parted"
DESCRIPTION = "Python module for the parted library.  It is used for manipulating \
partition tables."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.0"

RPM_NAME = "python311-parted-3.12.0-3.3.aarch64.rpm"
RPM_HASH = "c5153f9b6b00886a6eacd0b8e4817f96a6a7151789d4b286a99cfdf89475bf1de0a64abd5d62cb8c82b585c89e51f94c0fc95279042154bc897e4d619a5ead98"

RPROVIDES:${PN} += "python3-parted \
python3.11dist-pyparted \
python311-parted \
python3dist-pyparted"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libparted.so.2 \
parted \
python-abi"

inherit rpm
