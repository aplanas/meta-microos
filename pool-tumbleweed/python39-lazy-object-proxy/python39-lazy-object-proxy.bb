SUMMARY = "Rebuild a new abstract syntax tree from Python's ast"
DESCRIPTION = "A fast and thorough lazy object proxy that rebuilds a new abstract syntax tree \
from Python's ast"
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "python39-lazy-object-proxy-1.9.0-1.1.aarch64.rpm"
RPM_HASH = "0e12f9feecffbc93f11eb2d01d1147c58c1beaf4a606a1554404722b43a026dc521d7b37cf983468ecab8cfe9ddc9596b08a8d3c784577334cd234aa159ff4f9"

RPROVIDES:${PN} += "python3.9dist(lazy-object-proxy) \
python39-lazy-object-proxy \
python39-lazy-object-proxy(aarch-64) \
python39-lazy_object_proxy \
python3dist(lazy-object-proxy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
