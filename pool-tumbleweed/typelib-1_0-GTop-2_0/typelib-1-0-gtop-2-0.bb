SUMMARY = "Introspection bindings for libgtop"
DESCRIPTION = "A library that fetches information about the running system, such as \
CPU and memory usage and active processes. \
 \
On Linux systems, this information is taken directly from the /proc \
file system. On other systems, a server is used to read information \
from /dev/kmem. \
 \
This package provides the GObject Introspection bindings for libgtop."
LICENSE = "GPL-2.0-or-later"

PV = "2.40.0"

RPM_NAME = "typelib-1_0-GTop-2_0-2.40.0-4.3.aarch64.rpm"
RPM_HASH = "e40c682511b80eead8eb80ba466368224f623632b31d7f5a68af3aee2d1ac61bd6fd12a0d39f6e059cc8659787d88a7d72f04c0c7e98225a8c6120f8403a3b44"

RPROVIDES:${PN} += "typelib(GTop) \
typelib-1_0-GTop-2_0 \
typelib-1_0-GTop-2_0(aarch-64)"

RDEPENDS:${PN} += "libgtop-2.0.so.11()(64bit)"

inherit rpm
