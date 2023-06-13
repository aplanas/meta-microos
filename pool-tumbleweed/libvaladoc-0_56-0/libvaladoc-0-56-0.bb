SUMMARY = "Valadoc runtime"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.8"

RPM_NAME = "libvaladoc-0_56-0-0.56.8-1.1.aarch64.rpm"
RPM_HASH = "7b9226f907b4752bbc2c507c166b57817778086af2aa6b61ece1a40197997b646382b42d5e095dd5a6a985aa9a8d25dd9df3fb2e7fb68d9e1aef7bbe24057832"

RPROVIDES:${PN} += "libvaladoc-0.56.so.0()(64bit) \
libvaladoc-0_56-0 \
libvaladoc-0_56-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcgraph.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgvc.so.6()(64bit) \
libvala-0.56.so.0()(64bit) \
libvalaccodegen.so()(64bit)"

inherit rpm
