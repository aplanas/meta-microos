SUMMARY = "Generator for API documentation from Vala source"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.13"

RPM_NAME = "valadoc-0.56.13-1.1.aarch64.rpm"
RPM_HASH = "24ec056adea12a6a16b192569ed868013ed294d0539b1492af3947e0716bd3620cf6551e0074d75ff72200642fb2b2dc77748e35cbeabbd9cbc6ec88ea0e86ae"

RPROVIDES:${PN} += "valadoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvalaccodegen.so \
libvaladoc-0.56.so.0"

inherit rpm
