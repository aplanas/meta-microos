SUMMARY = "Library to Allow Applications to Communicate with nscd"
DESCRIPTION = "This library provides an interface for applications to NSCD (Name \
Service Cache Daemon) and allows those applications, to flush the \
cache for special services, if they have the necessary permissions."
LICENSE = "LGPL-2.1"

PV = "2.0.2"

RPM_NAME = "libnscd1-2.0.2-138.21.aarch64.rpm"
RPM_HASH = "0488f4aa8e568d900c85733a1b831997003e3c06f6c3d7dc490594384384eb37ff31a656421e95f6db56ad77735327dee2ac01a8401733ec922f04dd6ea9f4e1"

RPROVIDES:${PN} += "libnscd \
libnscd.so.1()(64bit) \
libnscd1 \
libnscd1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
