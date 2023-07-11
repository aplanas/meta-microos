SUMMARY = "Guitarix runtime library"
DESCRIPTION = "guitarix is a simple mono amplifier to jack with one input and two \
outputs."
LICENSE = "GPL-2.0-or-later"

PV = "0.44.1"

RPM_NAME = "libgxw0-0.44.1-2.3.aarch64.rpm"
RPM_HASH = "8012fef354298d49c16c49c0f450acd77fb2055154415072ba6403c94cb85f30850cb619dc7b3d530c168c9e1395a15668c3c2713c8b09d21d2818bef63cf9f3"

RPROVIDES:${PN} += "libgxw.so.0 \
libgxw0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
