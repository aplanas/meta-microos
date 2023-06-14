SUMMARY = "TeXshop-like TeX Editor"
DESCRIPTION = "The TeXworks project is a simple TeX front-end program (working \
environment) that is modeled on Dick Koch's TeXShop for Mac OS X."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.8"

RPM_NAME = "texworks-0.6.8-1.3.aarch64.rpm"
RPM_HASH = "f68c40c4c4680174717a427693c0298b5cd41219777fce1184c3a107bb0e6d3bc68f64c027ad7060b1981968a8694d3794b89ec26219ba87c6cd370bcc5f08f7"

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
