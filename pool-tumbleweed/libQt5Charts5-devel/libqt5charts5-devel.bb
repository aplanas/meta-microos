SUMMARY = "Development files for the Qt 5 Charts Library"
DESCRIPTION = "This package provides header files and shared libraries for development with \
Qt Charts."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5Charts5-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "da20c1fa7d70728995da1caccf21f4d30a2714d51dc234f05e22cbcc35e79b949ab4d374aa2cffa4d3bec4fc7b3672d3547219eff950605cd77387769c330579"

RPROVIDES:${PN} += "cmake(Qt5Charts) \
libQt5Charts5-devel \
libQt5Charts5-devel(aarch-64) \
pkgconfig(Qt5Charts)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Charts5 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui) \
pkgconfig(Qt5Widgets)"

inherit rpm
