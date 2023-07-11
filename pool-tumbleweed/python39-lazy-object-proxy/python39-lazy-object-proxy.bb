SUMMARY = "Rebuild a new abstract syntax tree from Python's ast"
DESCRIPTION = "A fast and thorough lazy object proxy that rebuilds a new abstract syntax tree \
from Python's ast"
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "python39-lazy-object-proxy-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "34363d51528644b6c6a1c5acbc4a283808de8a290f53d9f3443105232bac6c62c28ed076ba924fce574b29efa16bf6b1db24f0eeb7b8d4d69cb5e9864dd7ef2c"

RPROVIDES:${PN} += "python3.9dist-lazy-object-proxy \
python39-lazy-object-proxy \
python3dist-lazy-object-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
