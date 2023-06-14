SUMMARY = "Applications demoing the libsolv library"
DESCRIPTION = "Applications demoing the libsolv library."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "libsolv-demo-0.7.24-1.1.aarch64.rpm"
RPM_HASH = "b157e693fa2be1df874431c654e8ecdb2e177b3af43b917b52eefa1216515c41c9a0f14a18eea0193f4b50be4e180f47385395203313197dcf41f1d295e4ba1c"

RPROVIDES:${PN} += "libsolv-demo"

RDEPENDS:${PN} += "curl \
gpg2 \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.9 \
librpmio.so.9 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
