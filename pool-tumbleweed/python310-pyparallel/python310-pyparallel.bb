SUMMARY = "Python Parallel Port Extension"
DESCRIPTION = "This module encapsulates the access for the parallel port. It provides \
backends for Python running on Windows and Linux."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python310-pyparallel-0.2.2-3.17.noarch.rpm"
RPM_HASH = "b7ea8e4613a99d11ab488eb6acfb21621998ae1a07023694fe761f7be62f73e33557653bc4681b55701e6eff0c8f266e0879cb74f56a081f06ce424aff0027bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyparallel \
python3.10dist(pyparallel) \
python310-pyparallel \
python3dist(pyparallel)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
