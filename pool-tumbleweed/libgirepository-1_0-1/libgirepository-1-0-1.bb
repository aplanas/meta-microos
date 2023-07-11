SUMMARY = "GObject Introspection Library"
DESCRIPTION = "The goal of the project is to describe the APIs and collect them in \
a uniform, machine readable format."
LICENSE = "LGPL-2.1-or-later"

PV = "1.76.1"

RPM_NAME = "libgirepository-1_0-1-1.76.1-2.2.aarch64.rpm"
RPM_HASH = "bc5f7fab197d286ce53072b898166deb3a2d472df1b419d2e625aa6571b021e12ac588c7b075685d26a1c37818baf3c5600e657d6dd1ffa737ad380982bc9fca"

RPROVIDES:${PN} += "libgirepository-1-0-1 \
libgirepository-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
girepository-1-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
