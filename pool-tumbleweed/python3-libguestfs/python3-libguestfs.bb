SUMMARY = "Python 3 bindings for libguestfs"
DESCRIPTION = "python3-libguestfs contains Python 3 bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "python3-libguestfs-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "7320b7a79ca291d32d49b8510ba8464422d3546c927076b3dd19a46a67b92b2afdfb3ae16d27413a683462f21575e70350c9e818c46b754b010f2ed6969f6126"

RPROVIDES:${PN} += "libguestfsmod.cpython-311-aarch64-linux-gnu.so \
python3-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
python-abi"

inherit rpm
