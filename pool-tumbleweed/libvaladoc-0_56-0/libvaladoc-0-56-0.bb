SUMMARY = "Valadoc runtime"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.9"

RPM_NAME = "libvaladoc-0_56-0-0.56.9-1.1.aarch64.rpm"
RPM_HASH = "0cc5410454ebba82874ae81ed3066893544bc9fa13d5c939c04476a8c2ca9fb2a62c596d47890023540aed9572546339c9fadcd48b82e3709070fc56a760106f"

RPROVIDES:${PN} += "libvaladoc-0-56-0 \
libvaladoc-0.56.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgvc.so.6 \
libvala-0.56.so.0 \
libvalaccodegen.so"

inherit rpm
