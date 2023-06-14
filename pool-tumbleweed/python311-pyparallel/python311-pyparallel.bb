SUMMARY = "Python Parallel Port Extension"
DESCRIPTION = "This module encapsulates the access for the parallel port. It provides \
backends for Python running on Windows and Linux."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python311-pyparallel-0.2.2-3.17.noarch.rpm"
RPM_HASH = "568d112a513887767455af8e84a6d93478272331e1b64217bce095190dbe41b1ebd31bd8e02b6d904c549d672d94133f74e0afb1a9fe7d80180e32ce53328f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyparallel \
python311-pyparallel \
python3dist-pyparallel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
