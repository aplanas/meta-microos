SUMMARY = "A text editor for the Deepin environment"
DESCRIPTION = "Deepin Editor is a desktop text editor that supports common text editing \
features."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.40"

RPM_NAME = "deepin-editor-5.10.40-1.6.aarch64.rpm"
RPM_HASH = "2dbf02f4f7a6a40e28cc10a136b98a67869270a5b91dcb2ee8eefe2f89e318c1a498d743d3b1939b2ee9b05a6d53b2245f3e8727602ef7d19243bf60c525cb79"

RPROVIDES:${PN} += "application() \
application(deepin-editor.desktop) \
deepin-editor \
deepin-editor(aarch-64) \
mimehandler(application/json) \
mimehandler(application/x-desktop) \
mimehandler(application/x-perl) \
mimehandler(application/x-php) \
mimehandler(application/x-ruby) \
mimehandler(application/x-shellscript) \
mimehandler(application/xml) \
mimehandler(image/svg+xml) \
mimehandler(model/vrml) \
mimehandler(text/css) \
mimehandler(text/english) \
mimehandler(text/html) \
mimehandler(text/plain) \
mimehandler(text/sgml) \
mimehandler(text/vnd.wap.wml) \
mimehandler(text/x-adasrc) \
mimehandler(text/x-c++hdr) \
mimehandler(text/x-c++src) \
mimehandler(text/x-chdr) \
mimehandler(text/x-csrc) \
mimehandler(text/x-fortran) \
mimehandler(text/x-java) \
mimehandler(text/x-makefile) \
mimehandler(text/x-moc) \
mimehandler(text/x-objcsrc) \
mimehandler(text/x-pascal) \
mimehandler(text/x-patch) \
mimehandler(text/x-python) \
mimehandler(text/x-tcl) \
mimehandler(text/x-tex)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5SyntaxHighlighting.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libchardet.so.1()(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libicui18n.so.73()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libuchardet.so.0()(64bit)"

inherit rpm
