SUMMARY = "MPRIS command-line controller and library for media players"
DESCRIPTION = "Playerctl is a command-line utility and library for controlling \
media players that implement the MPRIS D-Bus Interface Specification. \
Playerctl makes it easy to bind player actions, such as play and pause, \
to media keys. \
 \
For more advanced users, Playerctl provides an introspectable library \
available in your favorite scripting language that allows more detailed \
control like the ability to subscribe to media player events or get metadata, \
such as artist and title for the playing track."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "playerctl-2.4.1-1.8.aarch64.rpm"
RPM_HASH = "1aadd03e08397efe9b3418073e1d63cc6341a5b88c98b69fc0d82291e95a64ce3f5028504a57e7acde1592f272f095767be4038e15379d293fc6e8f3d22625cf"

RPROVIDES:${PN} += "playerctl \
playerctl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libplayerctl.so.2()(64bit)"

inherit rpm
