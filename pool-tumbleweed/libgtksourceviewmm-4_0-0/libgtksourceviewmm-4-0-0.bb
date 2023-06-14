SUMMARY = "C++ interface for gtksourceview"
DESCRIPTION = "gtksourceviewmm provides a C++ interface to the gtksourceview library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.91.1"

RPM_NAME = "libgtksourceviewmm-4_0-0-3.91.1-1.16.aarch64.rpm"
RPM_HASH = "bf101c2a6341ac7942ec0ffb1ea7736509ed92ed53a41dacd9ee98e0df4ab6e712ae0ed368569620ff0c027a88d93e03be2554c7ab43d7f8cee75165b9d67c31"

RPROVIDES:${PN} += "libgtksourceviewmm-4-0-0 \
libgtksourceviewmm-4.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libgtksourceview-4.so.0 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
