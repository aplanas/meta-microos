SUMMARY = "Generator for API documentation from Vala source"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.9"

RPM_NAME = "valadoc-0.56.9-1.1.aarch64.rpm"
RPM_HASH = "296b9788acc0d9343d80c3c144f076f26902f7ded109c18b0d1c63c76ea7e9b2b56c75b418dbbe6c86785e4c89aab8f3e5021947d7b8cd283ba2abbce1ae4718"

RPROVIDES:${PN} += "valadoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvalaccodegen.so \
libvaladoc-0.56.so.0"

inherit rpm
