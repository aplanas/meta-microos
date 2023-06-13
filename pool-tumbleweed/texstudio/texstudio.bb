SUMMARY = "LaTeX Editor"
DESCRIPTION = "TeXstudio is a program based on texmaker, that integrates many tools needed \
to develop documents with LaTeX, in just one application. Using its editor \
you can write your documents with the help of interactive spell checking, \
syntax highlighting, automatically code completion and more."
LICENSE = "Apache-2.0 & GPL-2.0-only & GPL-3.0-only & MPL-1.1"

PV = "4.5.2"

RPM_NAME = "texstudio-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "d06abb402627f5c65a413292efaef152e5230338f9cfb9498f9f341ba6fb527e5c73c5774d51cd86e2fb4375eb1ca9d99bbd8a8b87071e096d8f347502c80b88"

RPROVIDES:${PN} += "application() \
application(texstudio.desktop) \
metainfo() \
metainfo(texstudio.metainfo.xml) \
mimehandler(text/x-tex) \
texstudio \
texstudio(aarch-64)"

RDEPENDS:${PN} += "hunspell \
ld-linux-aarch64.so.1()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpoppler-qt5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
texlive-latex"

inherit rpm
