SUMMARY = "Rebuild a new abstract syntax tree from Python's ast"
DESCRIPTION = "A fast and thorough lazy object proxy that rebuilds a new abstract syntax tree \
from Python's ast"
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "python311-lazy-object-proxy-1.9.0-1.1.aarch64.rpm"
RPM_HASH = "c8ed8a63e04bef96717fe1618a62cf8df2306d298c5626cb3295713ea9579b3e5572e517d0364a94ff329189b7be78caca777c6ac47035cbcce0f8e3eceefeef"

RPROVIDES:${PN} += "python3.11dist(lazy-object-proxy) \
python311-lazy-object-proxy \
python311-lazy-object-proxy(aarch-64) \
python311-lazy_object_proxy \
python3dist(lazy-object-proxy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
