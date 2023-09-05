SUMMARY = "Valadoc runtime"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.13"

RPM_NAME = "libvaladoc-0_56-0-0.56.13-1.1.aarch64.rpm"
RPM_HASH = "c3931fa583bb060a89fc09a1b4876b2adc588011befb2b9a8289d840c051bd611d5faa762b42fc8d277fefebcbf88f60d5c2d0e4076dd3ac37da6287ef09966b"

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
