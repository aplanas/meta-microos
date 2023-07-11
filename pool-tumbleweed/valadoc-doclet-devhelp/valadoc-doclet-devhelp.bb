SUMMARY = "Devhelp plugin for the valadoc generator"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.9"

RPM_NAME = "valadoc-doclet-devhelp-0.56.9-1.1.aarch64.rpm"
RPM_HASH = "1b45febe6b523bc95657e89982eb39ec08bb3021acec5aa701890d937cf0e6e598280b8de2aecf138f06cac07b2b20d8597fdfff93d92bea98e19ea4a257731f"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-devhelp"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
