SUMMARY = "XFS Filesystem-specific Shared library"
DESCRIPTION = "libhandle1 contains the shared libraries needed by xfsprogs \
to run xfsprogs programs. \
 \
libhandle1 is always needed by xfsprogs. If you want to use this \
library for your own new xfs tools install xfsprogs-devel."
LICENSE = "GPL-2.0-or-later"

PV = "6.3.0"

RPM_NAME = "libhandle1-6.3.0-1.1.aarch64.rpm"
RPM_HASH = "1bf68b9871a5c389fb97e1a7747e6c98ab6e8ef0a1a79864de803c4e956600e4bf9fd043eff4b62adaa64f66a91d93c27ad774a77913e8bc30cb9ddece0c2293"

RPROVIDES:${PN} += "libhandle.so.1()(64bit) \
libhandle1 \
libhandle1(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
