SUMMARY = "Ext2fs library"
DESCRIPTION = "The basic Ext2fs shared library."
LICENSE = "LGPL-2.0-only"

PV = "1.47.0"

RPM_NAME = "libext2fs2-1.47.0-1.1.aarch64.rpm"
RPM_HASH = "155ca05b30b4a355d95d4ba8951c92f2a7ee812532031274bc84f7d8f36023402438fe205cd1ac746a9f620c57aca54a7a0f2714c715e32a8b6952d2ae35afa6"

RPROVIDES:${PN} += "libe2p.so.2()(64bit) \
libext2fs.so.2()(64bit) \
libext2fs2 \
libext2fs2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcom_err.so.2()(64bit)"

inherit rpm
