SUMMARY = "Applications demoing the libsolv library"
DESCRIPTION = "Applications demoing the libsolv library."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "libsolv-demo-0.7.24-1.4.aarch64.rpm"
RPM_HASH = "e7aa0aa2bfc6ea6c9ffdc8c39290f2753830ee8c3167425d8e218f24d7e8c700faf287f66e754a039469aef2550f3877f3f47a8c59acaa8bc014eedb05abf88e"

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
