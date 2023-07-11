SUMMARY = "LaTeX Editor"
DESCRIPTION = "TeXstudio is a program based on texmaker, that integrates many tools needed \
to develop documents with LaTeX, in just one application. Using its editor \
you can write your documents with the help of interactive spell checking, \
syntax highlighting, automatically code completion and more."
LICENSE = "Apache-2.0 & GPL-2.0-only & GPL-3.0-only & MPL-1.1"

PV = "4.5.2"

RPM_NAME = "texstudio-4.5.2-1.2.aarch64.rpm"
RPM_HASH = "0160d449a27d246ec195fceaeba145ac1bc9ecf77b2541df9460e98b7fe36affef27810b3186bce9c0924a95d9fd783a35df07a7fc1ec34f7402142c9741f211"

RPROVIDES:${PN} += "texstudio"

RDEPENDS:${PN} += "hunspell \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpoppler-qt5.so.1 \
libstdc++.so.6 \
libz.so.1 \
texlive-latex"

inherit rpm
