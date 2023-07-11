SUMMARY = "The QT EchoLink Client"
DESCRIPTION = "This package contains Qtel, the Qt EchoLink client. It is an implementation of \
the EchoLink software in Qt. This is only an EchoLink client, that is it can not \
be connected to a transciever to create a link. If it is a pure link node you \
want, install the svxlink-server package."
LICENSE = "GPL-2.0-only"

PV = "1.2.2"

RPM_NAME = "qtel-1.2.2-5.10.aarch64.rpm"
RPM_HASH = "26276382bcfafa9f18aa2cdd092cbe4344c4b2678f3e0540723d9d2ac8bd66227954e58581151b0537a98ab1307c753983cd5665ba636df56b15cbb61cfdb21c"

RPROVIDES:${PN} += "qtel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libasyncaudio.so.1.6 \
libasynccore.so.1.6 \
libasyncqt.so.1.6 \
libc.so.6 \
libecholib.so.1.3 \
libgcc-s.so.1 \
libgsm.so.1 \
libm.so.6 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
