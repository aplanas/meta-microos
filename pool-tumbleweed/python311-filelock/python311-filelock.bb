SUMMARY = "Platform Independent File Lock in Python"
DESCRIPTION = "This package contains a single module, which implements a platform \
independent file lock in Python, which provides a simple way of \
inter-process communication."
LICENSE = "Unlicense"

PV = "3.12.2"

RPM_NAME = "python311-filelock-3.12.2-1.1.noarch.rpm"
RPM_HASH = "99b8f5fcc3f2952329e38d8d3dc9719dc68b79195881bf6412d342abd48c8978cbbf4e862007bf4d20dcb6eb8a34a7a3a569c7f24eb98b3277edf8822a8e636e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-filelock \
python3.11dist-filelock \
python311-filelock \
python3dist-filelock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
