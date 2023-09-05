SUMMARY = "HTML plugin for valadoc"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.13"

RPM_NAME = "valadoc-doclet-html-0.56.13-1.1.aarch64.rpm"
RPM_HASH = "3d833ff089cd33287ad73b6b7fd7b66357f0915d4225716254a9874807b9924d4f02fdeb9e1cc9405a38cd0e6f52332149933a549e3c72dd77de5e87e136bab1"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-html"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
