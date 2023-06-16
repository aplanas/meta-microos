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

RPM_NAME = "Cadence-0.9.2-1.3.aarch64.rpm"
RPM_HASH = "1377e899ab7fe61f15a08a7c9dee68032f5d60091b1db78bd46941d17d623105e9d1e71154f338784bdd54c28fa14a95f94cdba9237fe31276e78e7ff8ce8caf"

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
