SUMMARY = "HTML plugin for valadoc"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.9"

RPM_NAME = "valadoc-doclet-html-0.56.9-1.1.aarch64.rpm"
RPM_HASH = "d1bcd8898243bda6c0b40b46b95151b71acec3bd0e4a7e3544de73d17c5fa2ca7636cc19e93a667b1eecae0d5388ee2f7df0550c5b9ab74d30092299f673c1f6"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-html"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
