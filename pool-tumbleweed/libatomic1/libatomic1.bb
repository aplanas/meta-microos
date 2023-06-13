SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libatomic1-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "7eb7b4fd3717baca8b07277a5576304d981cb89732a157a6d1d64662315217685f4cdb34912ea3a2890b9312bf1841ed2337221300ab952c32ae7eb4ec98ca45"

RPROVIDES:${PN} += "libatomic.so.1()(64bit) \
libatomic1 \
libatomic1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
