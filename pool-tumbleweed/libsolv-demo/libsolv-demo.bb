SUMMARY = "Applications demoing the libsolv library"
DESCRIPTION = "Applications demoing the libsolv library."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "libsolv-demo-0.7.24-1.3.aarch64.rpm"
RPM_HASH = "1816887a1f55ecf34e1744ce3a24a8870612078677859edc8b920a8efcbf323933395088ab13b71532de55663a674809aca17f0ba7c2da14c702e2fdf11a5dd3"

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
