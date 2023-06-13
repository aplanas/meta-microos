SUMMARY = "MATE Desktop multimedia stack"
DESCRIPTION = "This package provides the Multimedia stack used by the MATE Desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "mate-media-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "a630fe16bd18c41267da760ec6465952c1f7837aa8dd24fdc82e9a1bd10a2bd1a62a82359a35261e00715967a1243a9f66c820e7c35afba7cbdb7c2ca950090c"

RPROVIDES:${PN} += "application() \
application(mate-volume-control.desktop) \
mate-media \
mate-media(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libmate-desktop-2.so.17()(64bit) \
libmate-panel-applet-4.so.1()(64bit) \
libmatemixer.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
