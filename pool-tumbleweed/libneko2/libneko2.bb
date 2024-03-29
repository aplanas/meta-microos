SUMMARY = "Neko virtual machine shared library"
DESCRIPTION = "Shared library for the Neko virtual machine."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "libneko2-2.3.0-3.1.aarch64.rpm"
RPM_HASH = "33ce13c97aa282e5ddb6eaa4d0ee73bf24fe2196f27f39d24034c8dc4e305eedc54fe2612cadbf8844f46c2d883736b4a6c02afbc327c2ba3db1ad12e93b41b1"

RPROVIDES:${PN} += "libneko.so.2 \
libneko2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgc.so.1 \
libm.so.6"

inherit rpm
