SUMMARY = "Rebuild a new abstract syntax tree from Python's ast"
DESCRIPTION = "A fast and thorough lazy object proxy that rebuilds a new abstract syntax tree \
from Python's ast"
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "python310-lazy-object-proxy-1.9.0-1.1.aarch64.rpm"
RPM_HASH = "0aae7ceea278524b1673de0eeab3a19b932fb17ed88452fc3ac9c01099a8b9e8d77f9fb517580b3e7ae324dc5ae2dc1974c5cd15c9e5bbf3766a74093bd1ac3f"

RPROVIDES:${PN} += "python3-lazy-object-proxy \
python3-lazy_object_proxy \
python3.10dist(lazy-object-proxy) \
python310-lazy-object-proxy \
python310-lazy-object-proxy(aarch-64) \
python310-lazy_object_proxy \
python3dist(lazy-object-proxy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
