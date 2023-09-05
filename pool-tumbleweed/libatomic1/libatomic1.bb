SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libatomic1-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "b7218140797258382976f7949b0d1b7d26365703557aea8fd7a5819656b0bcfa65eb3596a624e7a7411d0d4af9349af806768a7db351c1dfdaa2a0a2ea95e883"

RPROVIDES:${PN} += "libatomic.so.1 \
libatomic1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
