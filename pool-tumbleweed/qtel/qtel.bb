SUMMARY = "The QT EchoLink Client"
DESCRIPTION = "This package contains Qtel, the Qt EchoLink client. It is an implementation of \
the EchoLink software in Qt. This is only an EchoLink client, that is it can not \
be connected to a transciever to create a link. If it is a pure link node you \
want, install the svxlink-server package."
LICENSE = "GPL-2.0-only"

PV = "1.2.2"

RPM_NAME = "qtel-1.2.2-5.9.aarch64.rpm"
RPM_HASH = "059ece56a3be98692be86bc51607df22b811560033bcb44c220e3c2226276c02058b8f36d21319d8b735469a132d6d2d239d680aa8a8cd7e6427c1f2eb97eed9"

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
