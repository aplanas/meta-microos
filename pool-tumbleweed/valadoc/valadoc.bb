SUMMARY = "Generator for API documentation from Vala source"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.8"

RPM_NAME = "valadoc-0.56.8-1.1.aarch64.rpm"
RPM_HASH = "638ae931ad51f425758d15764d45e073526c94ce0216b8f03eae49b1ec3408cf6be9915cb6e4da21fdd5270f4c977973cce9a9bff49f91c6bf3eb2c0e91f1cd9"

RPROVIDES:${PN} += "valadoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvalaccodegen.so \
libvaladoc-0.56.so.0"

inherit rpm
