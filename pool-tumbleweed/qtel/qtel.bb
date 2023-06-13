SUMMARY = "The QT EchoLink Client"
DESCRIPTION = "This package contains Qtel, the Qt EchoLink client. It is an implementation of \
the EchoLink software in Qt. This is only an EchoLink client, that is it can not \
be connected to a transciever to create a link. If it is a pure link node you \
want, install the svxlink-server package."
LICENSE = "GPL-2.0-only"

PV = "1.2.2"

RPM_NAME = "qtel-1.2.2-5.9.aarch64.rpm"
RPM_HASH = "059ece56a3be98692be86bc51607df22b811560033bcb44c220e3c2226276c02058b8f36d21319d8b735469a132d6d2d239d680aa8a8cd7e6427c1f2eb97eed9"

RPROVIDES:${PN} += "application() \
application(qtel.desktop) \
qtel \
qtel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libasyncaudio.so.1.6()(64bit) \
libasynccore.so.1.6()(64bit) \
libasyncqt.so.1.6()(64bit) \
libc.so.6()(64bit) \
libecholib.so.1.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgsm.so.1()(64bit) \
libm.so.6()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
