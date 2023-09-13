SUMMARY = "OpenFabrics Alliance InfiniBand Userspace Management Datagram library"
DESCRIPTION = "libibumad provides the userspace management datagram (umad) library \
functions, which sit on top of the umad modules in the kernel. These \
are used by the IB diagnostic and management tools, including OpenSM."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibumad3-47.0-3.1.aarch64.rpm"
RPM_HASH = "46d03e92c8d2ee4b7046af6b9d227411f268f5878296c717c176421d28ba5ded3000e359dc6ad8f1137b4df53dce1c8bab1fcace4381f493c31c32497e8be677"

RPROVIDES:${PN} += "libibumad.so.3 \
libibumad3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
