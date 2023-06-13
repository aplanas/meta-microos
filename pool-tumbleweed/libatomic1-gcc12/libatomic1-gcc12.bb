SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libatomic1-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "149ab04f86d71ad2c7ada7486529a0024d9da35892103938732482909ed9271c37ed6a32d1cbe5c83a97af8a2beab2f572c519b7c9a99a57d319f2e811feed3a"

RPROVIDES:${PN} += "libatomic.so.1()(64bit) \
libatomic1 \
libatomic1-gcc12 \
libatomic1-gcc12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
