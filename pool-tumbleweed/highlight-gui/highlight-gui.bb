SUMMARY = "Graphical Interface for highlight"
DESCRIPTION = "This package provides graphical interface for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.6"

RPM_NAME = "highlight-gui-4.6-1.1.aarch64.rpm"
RPM_HASH = "61f9233556435a27f33577f224f8df1bfe7480e9d47327e4ccdc3706d6ffeef6a3c8efd7495cea5c6850902812123a21b54b54df125c70f3a074121892ee10cb"

RPROVIDES:${PN} += "application() \
application(highlight.desktop) \
highlight-gui \
highlight-gui(aarch-64)"

RDEPENDS:${PN} += "highlight-common \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblua5.4.so.5()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
