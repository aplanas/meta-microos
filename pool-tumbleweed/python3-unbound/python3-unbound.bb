SUMMARY = "Python modules and extensions for unbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the Python modules and extensions for unbound."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "python3-unbound-1.17.1-2.1.aarch64.rpm"
RPM_HASH = "a20e221746467efedb863400ca39c0ef87fc58a0b23ca2a499c99712a6fdf14ec62ebbfcaceb3482a395edcf8dde0172f7b8f21e1bce0bc563f6fdeb9995d1f6"

RPROVIDES:${PN} += "python3-unbound \
unbound-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
libunbound.so.8 \
libunbound8 \
python-abi"

inherit rpm
