SUMMARY = "XFS Filesystem-specific Shared library"
DESCRIPTION = "libhandle1 contains the shared libraries needed by xfsprogs \
to run xfsprogs programs. \
 \
libhandle1 is always needed by xfsprogs. If you want to use this \
library for your own new xfs tools install xfsprogs-devel."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "libhandle1-6.4.0-1.1.aarch64.rpm"
RPM_HASH = "f6e483f46639f31536c5a28785deb7b3a258af7479e2a63001911f97186105e296d4219b1113427cb3d2c34b2809a9265f270690ce36b1543ea332f5921bc583"

RPROVIDES:${PN} += "libhandle.so.1 \
libhandle1"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
