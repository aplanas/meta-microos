SUMMARY = "Gtkdoc plugin for valadoc"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.9"

RPM_NAME = "valadoc-doclet-gtkdoc-0.56.9-1.1.aarch64.rpm"
RPM_HASH = "d4c0db04e370bad2ca13ccb6ef23402a05f510cd292dd5997b6b205e524904178176d6a2aa8885e7a1d367c83428e7c3377854c92cd8466c4bb918c72c9cf778"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-gtkdoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
