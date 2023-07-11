SUMMARY = "Concurrent I/O library for Python 3"
DESCRIPTION = "Curio is a library for performing concurrent I/O with coroutines in Python 3."
LICENSE = "BSD-Source-Code"

PV = "1.6"

RPM_NAME = "python310-curio-1.6-3.3.noarch.rpm"
RPM_HASH = "b5d9f4f78339ffba16518a4de1bf86cfec8a58add3d228678264372f2b71b3625d166bb4bcb696f05c350d592a01f4c5937ff4ac1d0515a8d8bf0f76240934b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-curio \
python310-curio \
python3dist-curio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
