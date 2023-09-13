SUMMARY = "Python modules and extensions for unbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the Python modules and extensions for unbound."
LICENSE = "BSD-3-Clause"

PV = "1.18.0"

RPM_NAME = "python3-unbound-1.18.0-1.1.aarch64.rpm"
RPM_HASH = "ee5ae726bf3f4311bfe96bdaaba6a757e82ae3c0944415b1354f4cff1bac0b5edb5224ae347bfb906b7246a43d046e0d0dd0841041bea0655d8b9bb8d418eb33"

RPROVIDES:${PN} += "python3-unbound \
unbound-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
libunbound.so.8 \
libunbound8 \
python-abi"

inherit rpm
