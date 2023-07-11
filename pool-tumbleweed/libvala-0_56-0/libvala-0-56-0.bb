SUMMARY = "Vala programming language runtime"
DESCRIPTION = "Runtime library for the Vala programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.9"

RPM_NAME = "libvala-0_56-0-0.56.9-1.1.aarch64.rpm"
RPM_HASH = "b33f59b287a7f1d8fe802b320c0e5e1d27d3700f6abd1ac6d94a709cfce83f75b4f10fa4e86e6c6c13d19289eaa0c744f6b569a9ccdb16c349e3f4f45d911fc8"

RPROVIDES:${PN} += "libvala-0-56-0 \
libvala-0.56.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
