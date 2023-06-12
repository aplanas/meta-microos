SUMMARY = "Library to inspect and build Windows Installer (.MSI) files"
DESCRIPTION = "libmsi is a port of (and a subset of) Wine's implementation of the Windows \
Installer."
LICENSE = "LGPL-2.1-or-later"

PV = "0.101"

RPM_NAME = "libmsi0-0.101-1.10.aarch64.rpm"
RPM_HASH = "98071eb22073e58bf7ed2dcc40d15e207dcd3a625c2d986c5b13ed1eb4d05e80ae3a54880734d785b72688b7b9fc2d0ac69e148d2a76f7d859850dff48280e0f"

RPROVIDES:${PN} += "libmsi.so.0()(64bit) \
libmsi0 \
libmsi0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsf-1.so.114()(64bit)"

inherit rpm