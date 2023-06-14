SUMMARY = "Intelligent predictive GTK+ text editor"
DESCRIPTION = "gprompter is a cross-platform predictive text editor, based on presage, the intelligent predictive text entry platform. \
 \
gprompter displays predictions in a contextual pop-up box as each letter is typed. Predictions can be easily selected and inserted in the document."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "gprompter-0.9.1-13.1.aarch64.rpm"
RPM_HASH = "69b02c6523538616cf53a350933709e29c43de0441731bdafca3049b29b58745d4ff0da2a5b00b8ee1c951f7899df94d0dae14594cee1c4522c92ae169f4ca52"

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
