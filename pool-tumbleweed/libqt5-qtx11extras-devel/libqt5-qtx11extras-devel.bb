SUMMARY = "Development files for the Qt5 X11 Extras library"
DESCRIPTION = "You need this package if you want to compile programs with qtx11extras."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtx11extras-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "641e6a6d75731d397e19d4ca391e1edafcc38bd471b0e02796161cb3008262d4dff56ac99de427f7335d83d9fb8515c1e27d9a90f5bb1f0585f9a8c0721b01b9"

RPROVIDES:${PN} += "cmake(Qt5X11Extras) \
libQt5X11Extras-devel \
libqt5-qtx11extras-devel \
libqt5-qtx11extras-devel(aarch-64) \
pkgconfig(Qt5X11Extras)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5X11Extras5 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui)"

inherit rpm
