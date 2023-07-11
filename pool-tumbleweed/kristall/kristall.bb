SUMMARY = "Graphical small-internet client"
DESCRIPTION = "Graphical small-internet client supporting gemini, http, https, gopher, finger."
LICENSE = "GPL-3.0-or-later"

PV = "0.4"

RPM_NAME = "kristall-0.4-1.2.aarch64.rpm"
RPM_HASH = "d1a41756da300885c3aeb445380a38082f43de8f7329d0ea3d863f90796ccba00bc7ffd2241b5ae9d6aa7b96e893ae6fbeaa612c4afffa58e097782b8b681ddb"

RPROVIDES:${PN} += "kristall"

RDEPENDS:${PN} += "libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5MultimediaWidgets.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
