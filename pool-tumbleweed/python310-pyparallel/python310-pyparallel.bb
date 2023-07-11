SUMMARY = "Python Parallel Port Extension"
DESCRIPTION = "This module encapsulates the access for the parallel port. It provides \
backends for Python running on Windows and Linux."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python310-pyparallel-0.2.2-3.18.noarch.rpm"
RPM_HASH = "9e4d55678aaa7daf01d39a3312157af6b8af12d4fc551568ee21b24379cd7e423305ae59277a28ebf363cf14109644e516dc8bf077448ba01127766b2f16ad5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyparallel \
python310-pyparallel \
python3dist-pyparallel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
