SUMMARY = "GObject Introspection Library"
DESCRIPTION = "The goal of the project is to describe the APIs and collect them in \
a uniform, machine readable format."
LICENSE = "LGPL-2.1-or-later"

PV = "1.76.1"

RPM_NAME = "libgirepository-1_0-1-1.76.1-2.1.aarch64.rpm"
RPM_HASH = "fe8698ebd47885c472b79efe092b29550db31f4fbeb5410befb33e9a80d414eccbee3a575478fd98867cd52eb2b4d0ae36980f95dc6da31629bfb2274be6f760"

RPROVIDES:${PN} += "libgirepository-1.0.so.1()(64bit) \
libgirepository-1_0-1 \
libgirepository-1_0-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
girepository-1_0 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libffi.so.8()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
