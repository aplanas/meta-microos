SUMMARY = "OpenFabrics Alliance InfiniBand Userspace Management Datagram library"
DESCRIPTION = "libibumad provides the userspace management datagram (umad) library \
functions, which sit on top of the umad modules in the kernel. These \
are used by the IB diagnostic and management tools, including OpenSM."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibumad3-47.0-2.2.aarch64.rpm"
RPM_HASH = "e4f45199b4edfaac304f288da11d151002d4756e0cc98b85daa272e374c015c9610b3e32d5719de5682cbbe152a5511adc0d9793ce979531fb0bc2d19cdce80f"

RPROVIDES:${PN} += "libibumad.so.3 \
libibumad3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
