SUMMARY = "OpenFabrics Alliance InfiniBand Userspace Management Datagram library"
DESCRIPTION = "libibumad provides the userspace management datagram (umad) library \
functions, which sit on top of the umad modules in the kernel. These \
are used by the IB diagnostic and management tools, including OpenSM."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibumad3-47.0-1.1.aarch64.rpm"
RPM_HASH = "3ef262fb0609c1ae48bb77e905ffc08e7efad2668306266ce2580ce03124cd109a16a073b9857396a535acd2d4eb59e73521ab20841682414413a0b75fad8702"

RPROVIDES:${PN} += "libibumad.so.3 \
libibumad3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
