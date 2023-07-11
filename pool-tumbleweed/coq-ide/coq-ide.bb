SUMMARY = "IDE for The Coq Proof Assistant"
DESCRIPTION = "The Coq Integrated Development Interface is a graphical interface for the Coq proof assistant."
LICENSE = "LGPL-2.1-only"

PV = "8.17.1"

RPM_NAME = "coq-ide-8.17.1-1.1.aarch64.rpm"
RPM_HASH = "8f3e988cc9aabc7e95dfc01786e4c03e76023a564fc8bedb5990ac8a6e171516ed5c4714e3472c6a705a099e6c00e55283c239e90ea5a8624000356ae7e98de9"

RPROVIDES:${PN} += "coq-ide"

RDEPENDS:${PN} += "/usr/bin/ocamlrun \
coq \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
