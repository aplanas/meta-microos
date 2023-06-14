SUMMARY = "HTML plugin for valadoc"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.8"

RPM_NAME = "valadoc-doclet-html-0.56.8-1.1.aarch64.rpm"
RPM_HASH = "b536026f707050814b177355f8d5265b0f9b681019f1789aa0be7ce19e505844ddc2af48adbc865166a2ca39d7143e537798bfe2256d95de3b13e80e9578f36f"

RPROVIDES:${PN} += "libdoclet.so \
valadoc-doclet-html"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvaladoc-0.56.so.0"

inherit rpm
