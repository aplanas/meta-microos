SUMMARY = "Generator for API documentation from Vala source"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.12"

RPM_NAME = "valadoc-0.56.12-1.1.aarch64.rpm"
RPM_HASH = "f5919ff6f5b002cf9c589cdaf5762626edd53728f569d52b4c6a66111a45d8d2b01a7873d240c298a803088db386e6c81b679468bc20b28a9eed3f6330030df4"

RPROVIDES:${PN} += "valadoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvalaccodegen.so \
libvaladoc-0.56.so.0"

inherit rpm
