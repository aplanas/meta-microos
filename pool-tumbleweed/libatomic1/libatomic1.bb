SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libatomic1-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "8da8bc53d929cd9c49733495eb17e6ab780f4e1ef83524069304cc4e5f484d32d59e5ace8f1248334734a260cf2f15158e8ffe25f50bfdc4564dec1c0915b939"

RPROVIDES:${PN} += "libatomic.so.1 \
libatomic1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
