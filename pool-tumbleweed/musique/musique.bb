SUMMARY = "A different take on the music player"
DESCRIPTION = "Musique is a music player designed by and for people that love \
music. Musique does its best to stay out the way and keep you \
focused on the only thing that really matters: Music. \
You need to try it to really get it. \
To set expectations right — Musique is not about podcasts or \
internet radio; it's not about managing mobile devices and it has \
no integrated music store. \
It's about listening to beautiful music."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "1.10.1"

RPM_NAME = "musique-1.10.1-1.17.aarch64.rpm"
RPM_HASH = "c5e915dcadff1b49bcadba0733f3563a031f77ca6c13e15c16db76f252ede509b2fa917a091f6515f0eed2b0646bcbc182a1713c5cdf4bf441bc3b3a2b6b4aa0"

RPROVIDES:${PN} += "application() \
application(musique.desktop) \
musique \
musique(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmpv.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtag.so.1()(64bit)"

inherit rpm
