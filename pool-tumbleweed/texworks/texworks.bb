SUMMARY = "TeXshop-like TeX Editor"
DESCRIPTION = "The TeXworks project is a simple TeX front-end program (working \
environment) that is modeled on Dick Koch's TeXShop for Mac OS X."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.8"

RPM_NAME = "texworks-0.6.8-1.4.aarch64.rpm"
RPM_HASH = "700697a6db5056433b235090d3d6a2e3a86087a46d8951db15717ad1a7794488d65ff33c5d37effee1b4d49f33edc12635acb7644a2a5e6d91a02ab9a00e449a"

RPROVIDES:${PN} += "texworks"

RDEPENDS:${PN} += "dbus-1 \
hunspell \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Script.so.5 \
libQt5ScriptTools.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libm.so.6 \
libpoppler-qt5.so.1 \
libstdc++.so.6 \
libz.so.1 \
poppler-tools \
texlive-latex"

inherit rpm
