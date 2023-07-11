SUMMARY = "Python module for GNU parted"
DESCRIPTION = "Python module for the parted library.  It is used for manipulating \
partition tables."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.0"

RPM_NAME = "python310-parted-3.12.0-3.3.aarch64.rpm"
RPM_HASH = "10bb0827b1f5649160125e5a1a8a5b31084008cd5ea41d29525a02188f0f9b7291bcbbf18dfb6a129984af688c0b6102956119dddd151466712d0b609276e5ce"

RPROVIDES:${PN} += "python3.10dist-pyparted \
python310-parted \
python3dist-pyparted"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libparted.so.2 \
parted \
python-abi"

inherit rpm
