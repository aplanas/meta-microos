SUMMARY = "Python modules and extensions for unbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the Python modules and extensions for unbound."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "python3-unbound-1.17.1-1.3.aarch64.rpm"
RPM_HASH = "5a8a538ec8a1c5c765fd31c43d71e2488ee11c30cc0974e39566171bdad55d3757b2e50e09b37d5302ac54f2a3c6c21e01a0c8c77aca5e302617247d0ab6bee5"

RPROVIDES:${PN} += "python3-unbound \
python3-unbound(aarch-64) \
unbound-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpython3.10.so.1.0()(64bit) \
libunbound.so.8()(64bit) \
libunbound8 \
python(abi)"

inherit rpm
