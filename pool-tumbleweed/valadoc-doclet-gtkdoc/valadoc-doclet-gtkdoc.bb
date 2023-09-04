SUMMARY = "Gtkdoc plugin for valadoc"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.12"

RPM_NAME = "valadoc-doclet-gtkdoc-0.56.12-1.1.aarch64.rpm"
RPM_HASH = "643facc474fedb161da047a6197c8f283cd91bc7ce108ee936766b0371864f42df32477643f4eb861588b8216849e896fec3c5e681ce65b1be4a98e12db9d4eb"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-gtkdoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
