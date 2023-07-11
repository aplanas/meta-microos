SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libatomic1-gcc7-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "88bd6d4f3ba199cd85eab5fc44e529803684fd1e84253bf225a97006282a4032c2575125515cf3e7f4765c5725ca4af46299e01fec49f8558ebf3b4e36889ed0"

RPROVIDES:${PN} += "libatomic.so.1 \
libatomic1 \
libatomic1-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
