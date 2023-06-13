SUMMARY = "Simple Text Editor for Xfce"
DESCRIPTION = "Mousepad is a simple text editor for Xfce."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "mousepad-0.6.1-1.1.aarch64.rpm"
RPM_HASH = "34ce6bba79b9fd9bfe025e35cd2faa1982cf9a20e080419d884b6c90ed2db427138a02a44f6a9c903cb69d17bba3497175d327544095c76096e22592810e444f"

RPROVIDES:${PN} += "application() \
application(org.xfce.mousepad-settings.desktop) \
application(org.xfce.mousepad.desktop) \
libmousepad-plugin-gspell.so()(64bit) \
metainfo() \
metainfo(org.xfce.mousepad.appdata.xml) \
mimehandler(application/x-zerosize) \
mimehandler(text/plain) \
mousepad \
mousepad(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgspell-1.so.2()(64bit) \
libgtk-3.so.0()(64bit) \
libmousepad.so.0()(64bit)"

inherit rpm
