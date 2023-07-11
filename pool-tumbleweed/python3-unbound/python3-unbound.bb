SUMMARY = "Python modules and extensions for unbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the Python modules and extensions for unbound."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "python3-unbound-1.17.1-1.5.aarch64.rpm"
RPM_HASH = "e565f61b8a0a5875979b8d4af025a1f9c7a9a4a67958c5fb0ca5d23ee6e4092900928fb421eb8ef4f09beac09bd379d8ae339ea9a8f41f9c73343169ea1640f2"

RPROVIDES:${PN} += "python3-unbound \
unbound-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
libunbound.so.8 \
libunbound8 \
python-abi"

inherit rpm
