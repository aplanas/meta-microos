SUMMARY = "Note-taking Plugin for the Xfce Panel"
DESCRIPTION = "The Notes plugin provides the equivalent to post-it notes on the Xfce desktop \
and allows to quickly take and store small notes."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.0"

RPM_NAME = "xfce4-notes-plugin-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "378aa814fb4f14b547b1ebb3dc97cbd8d28edf059bcaf766dedc48ebcdcaeccd7cb1f2bf2db2a317770771fddb3e42fa6ce0d53d4bca10784e268ff975a461aa"

RPROVIDES:${PN} += "application() \
application(xfce4-notes.desktop) \
libnotes.so()(64bit) \
xfce4-notes-plugin \
xfce4-notes-plugin(aarch-64) \
xfce4-panel-plugin-notes"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
xfce4-panel"

inherit rpm
