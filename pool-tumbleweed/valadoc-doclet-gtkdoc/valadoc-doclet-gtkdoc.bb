SUMMARY = "Gtkdoc plugin for valadoc"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.8"

RPM_NAME = "valadoc-doclet-gtkdoc-0.56.8-1.1.aarch64.rpm"
RPM_HASH = "8f156171baadf4513fe966852c5bc40d006ceb7773da3c58a44158113f3ea449bebc0899b6015e63534174b073675158e04e36a64a5f0d0ac1973c5af5413457"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-gtkdoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
