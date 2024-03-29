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

RPM_NAME = "playerctl-2.4.1-1.9.aarch64.rpm"
RPM_HASH = "98670b8caee817fa6230abef19a9284da405f128381c4e960996ce83635f8e06033621770b72f199127acfcf1f6294380b248a1be278f64b635f6dfc6d32be83"

RPROVIDES:${PN} += "playerctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libplayerctl.so.2"

inherit rpm
