SUMMARY = "Gtkdoc plugin for valadoc"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.13"

RPM_NAME = "valadoc-doclet-gtkdoc-0.56.13-1.1.aarch64.rpm"
RPM_HASH = "4ed670e0628f4a73ffac5da40149df41f8d8c753f54df54e20a5b813b4a3b5472a740a042cc95858e692d988ecd4d4c735754b9d97354729258156cfde2ab5b4"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-gtkdoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
