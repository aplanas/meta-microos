SUMMARY = "AVFS - an archive look-inside filesystem"
DESCRIPTION = "AVFS is a filesystem which enables all programs to look inside archived or \
compressed files, or access remote files without recompiling the programs \
or changing the kernel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "avfs-1.1.5-1.3.aarch64.rpm"
RPM_HASH = "6c58ee900de5b025d8425f7ad1affebf102807fac1d457be9a1a46eece60c5b90294018b8934505fa759985ce9bf768017bc36a5688fde918d511492fa161a68"

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
