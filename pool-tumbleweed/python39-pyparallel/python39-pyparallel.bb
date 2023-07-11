SUMMARY = "Python Parallel Port Extension"
DESCRIPTION = "This module encapsulates the access for the parallel port. It provides \
backends for Python running on Windows and Linux."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python39-pyparallel-0.2.2-3.18.noarch.rpm"
RPM_HASH = "30b98c05f335789da97078dfe47c70c147271d166250d3d8111eb2bc9a8a02b9b4275be41fdcd6ae9fed8040012b570c7b18ba18dbca82e1439d85564d9237ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyparallel \
python39-pyparallel \
python3dist-pyparallel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
