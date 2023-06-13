SUMMARY = "AVFS - an archive look-inside filesystem"
DESCRIPTION = "AVFS is a filesystem which enables all programs to look inside archived or \
compressed files, or access remote files without recompiling the programs \
or changing the kernel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "avfs-1.1.5-1.2.aarch64.rpm"
RPM_HASH = "b43ee290dc3ac379964e7f092fd71bf5b972b817e375e708f4c39c4b39467d62bb3c09ad07acf192c998899fdeff86c3cc4bd303ccb5d79731c1bb5fbbffdf7a"

RPROVIDES:${PN} += "avfs \
avfs(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libfuse.so.2()(64bit) \
liblz.so.1()(64bit) \
liblzma.so.5()(64bit) \
libneon.so.27()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
