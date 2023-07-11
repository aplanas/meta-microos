SUMMARY = "A JACK Audio Toolbox"
DESCRIPTION = "Cadence is a set of tools useful for audio production. \
Cadence itself is also an application (the main one). \
There are other applications that are part of the Cadence suite, \
they are usually named as the 'Cadence tools'. \
They are: \
 \
    Catarina \
    Catia \
    Claudia \
 \
Some of these also have sub-tools, such as Cadence-JackMeter and Claudia-Launcher."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "Cadence-0.9.2-1.4.aarch64.rpm"
RPM_HASH = "853530d874f66e6211723cdaa87459bf3f75ac1c90db76382fd5b3866e9a8fbfe38465a4814a99d529d4fab078d916bf443b3532c826ad13a8838f1f24832137"

RPROVIDES:${PN} += "Cadence"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
a2jmidid \
dbus-1-python3 \
jack-capture \
ladish \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python3-qt5"

inherit rpm
