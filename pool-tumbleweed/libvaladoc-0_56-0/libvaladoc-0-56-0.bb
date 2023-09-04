SUMMARY = "Valadoc runtime"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.12"

RPM_NAME = "libvaladoc-0_56-0-0.56.12-1.1.aarch64.rpm"
RPM_HASH = "247e9109dbb3afd30123d886b0eb957f7fa0334e86c083fcb23c3f8f8db62f6abbfde601edcf1ccc9eb1f2d09f29ea19456b366e32eaf0710764e4d2f42265fe"

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
