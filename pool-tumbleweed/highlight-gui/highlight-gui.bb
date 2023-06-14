SUMMARY = "Graphical Interface for highlight"
DESCRIPTION = "This package provides graphical interface for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.6"

RPM_NAME = "highlight-gui-4.6-1.1.aarch64.rpm"
RPM_HASH = "61f9233556435a27f33577f224f8df1bfe7480e9d47327e4ccdc3706d6ffeef6a3c8efd7495cea5c6850902812123a21b54b54df125c70f3a074121892ee10cb"

RPROVIDES:${PN} += "highlight-gui"

RDEPENDS:${PN} += "highlight-common \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
