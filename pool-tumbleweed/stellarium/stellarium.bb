SUMMARY = "Astronomical Sky Simulator"
DESCRIPTION = "Stellarium is a software to render 3D photo-realistic skies in real \
time, similar to what can be observed with human eyes through \
binoculars or a small telescope."
LICENSE = "GPL-2.0-or-later"

PV = "23.1"

RPM_NAME = "stellarium-23.1-1.1.aarch64.rpm"
RPM_HASH = "88c0ed710b200564838013d72420248e8a87078bfa90b2699dd790d36355f7d5be3146cceb4e4848255c62556d289f9b176fdda5c273a435d617822d7f2ab45b"

RPROVIDES:${PN} += "stellarium"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6SerialPort.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgps.so.30 \
libindiclient.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
qt6-multimedia"

inherit rpm
