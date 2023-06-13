SUMMARY = "A Qt GUI for Google, Yandex and Bing translators"
DESCRIPTION = "A simple and lightweight translator that allows to translate and speak \
text using Google, Yandex and Bing written with Qt5."
LICENSE = "GPL-3.0-only"

PV = "2.10.0"

RPM_NAME = "crow-translate-2.10.0-1.4.aarch64.rpm"
RPM_HASH = "32fbcf58dfeeb4ee16e9ab0653d959208adffc7191670ac3d9163979c419f3da2a2d12293f158037d5bda68be8a2aa7128077dc9ec7e71849b3e3f0cb02a3ba6"

RPROVIDES:${PN} += "application() \
application(io.crow_translate.CrowTranslate.desktop) \
crow-translate \
crow-translate(aarch-64) \
metainfo() \
metainfo(io.crow_translate.CrowTranslate.metainfo.xml)"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1()(64bit) \
libKF5WaylandClient.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libtesseract.so.5.3.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
