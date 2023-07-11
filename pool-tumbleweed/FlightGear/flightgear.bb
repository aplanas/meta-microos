SUMMARY = "Flight Simulator"
DESCRIPTION = "The FlightGear project is working to create a sophisticated flight \
simulator framework for the development and pursuit of interesting \
flight simulator ideas. We are developing a solid basic sim that can be \
expanded and improved upon by anyone interested in contributing"
LICENSE = "GPL-2.0-only"

PV = "2020.3.18"

RPM_NAME = "FlightGear-2020.3.18-1.2.aarch64.rpm"
RPM_HASH = "ae46bd3a8cf5d319a3667e5bfb7cb7045d567cf17f1af9b0815fdb222dadf7c6910c173f83c9b2b3fb08d64a9187bcbcf0a77203b9a6ba54790e2de1237e6988"

RPROVIDES:${PN} += "FlightGear"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libOpenThreads.so.21 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libSimGearCore.so.2020.3.18 \
libSimGearScene.so.2020.3.18 \
libX11.so.6 \
libc.so.6 \
libdbus-1.so.3 \
libevent-core-2.1.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libosg.so.161 \
libosgDB.so.161 \
libosgGA.so.161 \
libosgText.so.161 \
libosgUtil.so.161 \
libosgViewer.so.161 \
libplibpu.so.0 \
libplibpuaux.so.0 \
libplibsg.so.0 \
libplibul.so.0 \
libspeex.so.1 \
libspeexdsp.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libudev.so.1 \
libz.so.1"

inherit rpm
