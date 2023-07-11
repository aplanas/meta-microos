SUMMARY = "Python Parallel Port Extension"
DESCRIPTION = "This module encapsulates the access for the parallel port. It provides \
backends for Python running on Windows and Linux."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python311-pyparallel-0.2.2-3.18.noarch.rpm"
RPM_HASH = "8cfbb8286bb49618911079e1d82d6215856c334b4cfb5236b2d71c19e4a02e4e141a10a7e84b4faa5628f25f87ff3e6c3cef3d90f271b75f65d51de8e11d8e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyparallel \
python3.11dist-pyparallel \
python311-pyparallel \
python3dist-pyparallel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
