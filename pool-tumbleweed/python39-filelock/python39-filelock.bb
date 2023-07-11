SUMMARY = "Platform Independent File Lock in Python"
DESCRIPTION = "This package contains a single module, which implements a platform \
independent file lock in Python, which provides a simple way of \
inter-process communication."
LICENSE = "Unlicense"

PV = "3.12.2"

RPM_NAME = "python39-filelock-3.12.2-1.1.noarch.rpm"
RPM_HASH = "756016a8b9cfb744a013557b0e1482412264cee16700475514e85896ce754627d03f18d791a93f74c818ca2dea4f9802f512475cd5b96682937d02c1df863955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-filelock \
python39-filelock \
python3dist-filelock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
