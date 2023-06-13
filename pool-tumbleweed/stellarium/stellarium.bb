SUMMARY = "Astronomical Sky Simulator"
DESCRIPTION = "Stellarium is a software to render 3D photo-realistic skies in real \
time, similar to what can be observed with human eyes through \
binoculars or a small telescope."
LICENSE = "GPL-2.0-or-later"

PV = "23.1"

RPM_NAME = "stellarium-23.1-1.1.aarch64.rpm"
RPM_HASH = "88c0ed710b200564838013d72420248e8a87078bfa90b2699dd790d36355f7d5be3146cceb4e4848255c62556d289f9b176fdda5c273a435d617822d7f2ab45b"

RPROVIDES:${PN} += "application() \
application(org.stellarium.Stellarium.desktop) \
metainfo() \
metainfo(org.stellarium.Stellarium.appdata.xml) \
mimehandler(application/x-stellarium-script) \
stellarium \
stellarium(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Charts.so.6()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Multimedia.so.6()(64bit) \
libQt6MultimediaWidgets.so.6()(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6OpenGLWidgets.so.6()(64bit) \
libQt6OpenGLWidgets.so.6(Qt_6)(64bit) \
libQt6Positioning.so.6()(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6SerialPort.so.6()(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgps.so.30()(64bit) \
libindiclient.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
qt6-multimedia"

inherit rpm
