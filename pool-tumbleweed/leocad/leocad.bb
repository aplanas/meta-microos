SUMMARY = "CAD program for creating virtual LEGO models"
DESCRIPTION = "CAD program for creating virtual LEGO models. \
It has an intuitive interface, designed to allow \
new users to start creating new models without \
having to spend too much time learning the \
application."
LICENSE = "GPL-2.0-only"

PV = "21.06"

RPM_NAME = "leocad-21.06-1.5.aarch64.rpm"
RPM_HASH = "f78b2b17d98e744001a41ec8cde9582b7dbc41a7b369e5f217ac026572894c9eb05265f0f75e660e1555ce19dfa7abb51b2afcd2a4d61154fc8a5276554d3379"

RPROVIDES:${PN} += "leocad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
povray"

inherit rpm
