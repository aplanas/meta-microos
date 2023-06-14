SUMMARY = "A NapiProjekt client"
DESCRIPTION = "QNapi is unofficial clone of NapiProjekt program (http://napiprojekt.pl) \
written using Qt5. It's focused to be functional on GNU/Linux and other \
Unix-like systems, for which NapiProjekt is not available."
LICENSE = "GPL-2.0-or-later & BSD-2-Clause & BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "qnapi-0.2.3-5.26.aarch64.rpm"
RPM_HASH = "fda0831e9194b9d79252f427d74b99bcd25661b6e56da94921b3ceb366ef69528c37c422310d63636b42e65fad8b47cca48148c53a59d96874c5694a6d299b3d"

RPROVIDES:${PN} += "qnapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libmaia.so.1 \
libmediainfo.so.0 \
libstdc++.so.6 \
p7zip-full"

inherit rpm
