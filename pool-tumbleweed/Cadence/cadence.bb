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

RPM_NAME = "Cadence-0.9.2-2.1.aarch64.rpm"
RPM_HASH = "203f191c00e32bc3fd30b8b1937115f43218fe828de89a275e4f9fd3e1d032f2dad52c8c408f04b15bac48f0706db722c04eb43f68ac0fe8f0b217750dac6893"

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
