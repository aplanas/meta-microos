SUMMARY = "Platform Independent File Lock in Python"
DESCRIPTION = "This package contains a single module, which implements a platform \
independent file lock in Python, which provides a simple way of \
inter-process communication."
LICENSE = "Unlicense"

PV = "3.12.0"

RPM_NAME = "python39-filelock-3.12.0-1.1.noarch.rpm"
RPM_HASH = "f9be2058cffe16e0757b27183db76b038eb43abe0f233b26f16084d24315e04a165ab438ac8daa6c3e15ee5fc66c8e56e5cea5765a935f777fd24095b52c2977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(filelock) \
python39-filelock \
python3dist(filelock)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
