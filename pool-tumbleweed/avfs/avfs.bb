SUMMARY = "AVFS - an archive look-inside filesystem"
DESCRIPTION = "AVFS is a filesystem which enables all programs to look inside archived or \
compressed files, or access remote files without recompiling the programs \
or changing the kernel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "avfs-1.1.5-1.2.aarch64.rpm"
RPM_HASH = "b43ee290dc3ac379964e7f092fd71bf5b972b817e375e708f4c39c4b39467d62bb3c09ad07acf192c998899fdeff86c3cc4bd303ccb5d79731c1bb5fbbffdf7a"

RPROVIDES:${PN} += "avfs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libfuse.so.2 \
liblz.so.1 \
liblzma.so.5 \
libneon.so.27 \
libz.so.1 \
libzstd.so.1"

inherit rpm
