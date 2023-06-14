SUMMARY = "Shared library for AVFS, an archive look-inside filesystem"
DESCRIPTION = "This package includes the runtime shared library for the package avfs. \
AVFS is a system, which enables all programs to look inside archived or \
compressed files, or access remote files without recompiling the programs \
or changing the kernel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "libavfs0-1.1.5-1.2.aarch64.rpm"
RPM_HASH = "a8fd485156b2ac76ad22f5b6e6589a79fde2b7555797f47c1f36d1cf4cc32569bb5e1b724c9990b8448094ebf959b310f1ef090a640d169bfe2b7abf0bcb9155"

RPROVIDES:${PN} += "libavfs.so.0 \
libavfs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblz.so.1 \
liblzma.so.5 \
libneon.so.27 \
libz.so.1 \
libzstd.so.1"

inherit rpm
