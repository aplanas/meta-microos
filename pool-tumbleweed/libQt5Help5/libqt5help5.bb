SUMMARY = "Qt 5 Help Library"
DESCRIPTION = "The Qt 5 Help library."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde3"

RPM_NAME = "libQt5Help5-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "10cd8e5c70b5f5cd525944c26a9443089dc0a749a11a5da6fb5e7440d097d1a8cb7fda2de2184e42a800b6e3d5e6995ebef79cc65e5b13d5c7d7a218804da5a2"

RPROVIDES:${PN} += "libQt5Help.so.5 \
libQt5Help5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network5 \
libQt5Sql.so.5 \
libQt5Sql5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
