SUMMARY = "Graphical User Interface to Control JACK Servers"
DESCRIPTION = "JACK Audio Connection Kit - Qt GUI Interface: A simple Qt application \
to control the JACK server. Written in C++ around the Qt4 toolkit \
for X11, most exclusively using Qt Designer. Provides a simple GUI \
dialog for setting several JACK server parameters, which are properly \
saved between sessions, and a way control of the status of the audio \
server. With time, this primordial interface has become richer by \
including a enhanced patchbay and connection control features."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.10"

RPM_NAME = "qjackctl-0.9.10-1.2.aarch64.rpm"
RPM_HASH = "54d59f3d8dc4b8ead4c6e86b3170004a44c4702f2677a3147513874bb3c1f022e782403b5a45f647a69b5f8e4bbc6d607b11763578d9c4849f8007c9d80039f4"

RPROVIDES:${PN} += "qjackctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libportaudio.so.2 \
libstdc++.so.6"

inherit rpm
