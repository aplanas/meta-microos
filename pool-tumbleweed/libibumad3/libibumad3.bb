SUMMARY = "OpenFabrics Alliance InfiniBand Userspace Management Datagram library"
DESCRIPTION = "libibumad provides the userspace management datagram (umad) library \
functions, which sit on top of the umad modules in the kernel. These \
are used by the IB diagnostic and management tools, including OpenSM."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libibumad3-45.0-1.2.aarch64.rpm"
RPM_HASH = "47c241afbb0c8bffc7b5217ed2c70cf9c373422bb31b2731c5f865f80bab2c54623e26a09bfabb584a9158a3d460400b16b7446a114eff750770f47b49f114bd"

RPROVIDES:${PN} += "libibumad.so.3 \
libibumad3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
