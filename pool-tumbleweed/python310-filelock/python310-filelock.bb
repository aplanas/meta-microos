SUMMARY = "Platform Independent File Lock in Python"
DESCRIPTION = "This package contains a single module, which implements a platform \
independent file lock in Python, which provides a simple way of \
inter-process communication."
LICENSE = "Unlicense"

PV = "3.12.2"

RPM_NAME = "python310-filelock-3.12.2-1.1.noarch.rpm"
RPM_HASH = "7b1721f45cb82839ff0e0aff82de926725f6d8dc1203ee4ff4eb3198abd0c80f70002a5681f13d075ce08e682c77188459fbc26779b73a657b8c8fc16b652cd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-filelock \
python310-filelock \
python3dist-filelock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
