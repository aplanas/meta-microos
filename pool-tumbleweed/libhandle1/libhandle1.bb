SUMMARY = "XFS Filesystem-specific Shared library"
DESCRIPTION = "libhandle1 contains the shared libraries needed by xfsprogs \
to run xfsprogs programs. \
 \
libhandle1 is always needed by xfsprogs. If you want to use this \
library for your own new xfs tools install xfsprogs-devel."
LICENSE = "GPL-2.0-or-later"

PV = "6.3.0"

RPM_NAME = "libhandle1-6.3.0-1.2.aarch64.rpm"
RPM_HASH = "0f2fdbcda93950deb67cc1837cc9b3eb71bdef7336b00bc0f607b1c3870534924f88399e3cc13ae8bcd04ceefa8bbccbaf0613a900739ab6e83e9716de340cf7"

RPROVIDES:${PN} += "libhandle.so.1 \
libhandle1"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
