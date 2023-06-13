SUMMARY = "Vala programming language runtime"
DESCRIPTION = "Runtime library for the Vala programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.8"

RPM_NAME = "libvala-0_56-0-0.56.8-1.1.aarch64.rpm"
RPM_HASH = "a3b445dd1f7792f4ed310fe2982926a00647c1a8a7d41d55e4bc6e4231834d06e471a80b09e9188f2036b386e9546619dd5c1072548c622bc58b918801733b7d"

RPROVIDES:${PN} += "libvala-0.56.so.0()(64bit) \
libvala-0_56-0 \
libvala-0_56-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
