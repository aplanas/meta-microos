SUMMARY = "HTML plugin for valadoc"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.12"

RPM_NAME = "valadoc-doclet-html-0.56.12-1.1.aarch64.rpm"
RPM_HASH = "2bddcb31ca65a994610fbe214676e897aa14873aec59e760469bbf763fa877e8d243e64b1ced1b66a8c2588a5594c8c61403d4f8738686a1c383626a28940b8b"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-html"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
