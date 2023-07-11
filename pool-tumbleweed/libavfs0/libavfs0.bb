SUMMARY = "Shared library for AVFS, an archive look-inside filesystem"
DESCRIPTION = "This package includes the runtime shared library for the package avfs. \
AVFS is a system, which enables all programs to look inside archived or \
compressed files, or access remote files without recompiling the programs \
or changing the kernel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "libavfs0-1.1.5-1.3.aarch64.rpm"
RPM_HASH = "559bcb0f7a364f697b09ff9dab68886247801da7a18954662e1db6eeafa2712df1c44601525643b953778d4e2fcb14da749e602870e8bf41ef27269fbd2b97b8"

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
