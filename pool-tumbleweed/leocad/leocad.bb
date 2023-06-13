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

RPROVIDES:${PN} += "application() \
application(leocad.desktop) \
leocad \
leocad(aarch-64) \
metainfo() \
metainfo(leocad.appdata.xml) \
mimehandler(application/vnd.leocad) \
mimehandler(application/x-ldlite) \
mimehandler(application/x-ldraw) \
mimehandler(application/x-multi-part-ldraw) \
mimehandler(application/x-multipart-ldraw)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
povray"

inherit rpm
