SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7552"

RPM_NAME = "libatomic1-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "04544ccf13870fc1ec8ccafa5a8e9d2bc19b7a5459dd0c403696d6108ab934bd9f9454d16989081c2eeb4129a093e9242c8013ac9ecbb9926306c5ab311a2783"

RPROVIDES:${PN} += "libatomic.so.1 \
libatomic1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
