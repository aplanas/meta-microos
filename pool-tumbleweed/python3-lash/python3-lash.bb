SUMMARY = "Python bindings for LASH"
DESCRIPTION = "This package contains the language bindings for Python."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "python3-lash-0.5.4-2.12.aarch64.rpm"
RPM_HASH = "a076c5a40eafbf69789f8d66998eef3e8a1f63e06552d5f21da35736b991b87272294878ca45b9ffd12a07a1c9f16f2e2c8f2d9dd59b0d3da8822e70acfbf684"

RPROVIDES:${PN} += "python3-lash"

RDEPENDS:${PN} += "lash \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblash.so.1 \
python-abi"

inherit rpm
