SUMMARY = "Concurrent I/O library for Python 3"
DESCRIPTION = "Curio is a library for performing concurrent I/O with coroutines in Python 3."
LICENSE = "BSD-Source-Code"

PV = "1.6"

RPM_NAME = "python39-curio-1.6-3.1.noarch.rpm"
RPM_HASH = "55fae18f146a4a04d82bf28a2e8ec7583049c3b837b2fd7eec49f8c0a424a03c8f6fbff7027247ed5b0cbc3c261da86705e372a7868a304f9c9a44aa68b2705f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-curio \
python39-curio \
python3dist-curio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
