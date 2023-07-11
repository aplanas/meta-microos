SUMMARY = "Intelligent predictive GTK+ text editor"
DESCRIPTION = "gprompter is a cross-platform predictive text editor, based on presage, the intelligent predictive text entry platform. \
 \
gprompter displays predictions in a contextual pop-up box as each letter is typed. Predictions can be easily selected and inserted in the document."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "gprompter-0.9.1-13.2.aarch64.rpm"
RPM_HASH = "375fdec1f340a13df6b12df0e04d7bcfa90496b63bd362bb7cc9dc843512a9c6274d2864a608085b7f7258b3f9c2db3e29dd712057ed4f8471d41d05a6372a21"

RPROVIDES:${PN} += "gprompter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpresage.so.1 \
libstdc++.so.6"

inherit rpm
