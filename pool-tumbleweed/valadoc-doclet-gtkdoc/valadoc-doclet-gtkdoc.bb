SUMMARY = "Gtkdoc plugin for valadoc"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.8"

RPM_NAME = "valadoc-doclet-gtkdoc-0.56.8-1.1.aarch64.rpm"
RPM_HASH = "8f156171baadf4513fe966852c5bc40d006ceb7773da3c58a44158113f3ea449bebc0899b6015e63534174b073675158e04e36a64a5f0d0ac1973c5af5413457"

RPROVIDES:${PN} += "libdoclet.so()(64bit) \
valadoc-doclet-gtkdoc \
valadoc-doclet-gtkdoc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libvala-0.56.so.0()(64bit) \
libvaladoc-0.56.so.0()(64bit)"

inherit rpm
