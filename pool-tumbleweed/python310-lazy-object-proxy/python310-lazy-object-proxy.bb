SUMMARY = "Rebuild a new abstract syntax tree from Python's ast"
DESCRIPTION = "A fast and thorough lazy object proxy that rebuilds a new abstract syntax tree \
from Python's ast"
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "python310-lazy-object-proxy-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "d01970f024136369147a483f38241e25377aee85a151624e79953c109b62da966e85d4488ee5c33a57ed683a5fd01540b01b340181574bcdbddb1a8a55a27659"

RPROVIDES:${PN} += "python3.10dist-lazy-object-proxy \
python310-lazy-object-proxy \
python3dist-lazy-object-proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
