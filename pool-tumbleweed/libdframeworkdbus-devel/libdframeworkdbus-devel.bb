SUMMARY = "Development tools for libdframeworkdbus - deepin-qt-dbus-factory"
DESCRIPTION = "de-qt-dbus-factory is a repository storing auto-generated Qt5 D-Bus \
code. \
 \
The libdbusextended-devel package contains the header files and developer \
docs for libdbusextended(deepin-qt-dbus-factory)."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.22"

RPM_NAME = "libdframeworkdbus-devel-5.5.22-1.7.aarch64.rpm"
RPM_HASH = "13d31085f0955c600fdd307c1c1eba0530741577722251c61a06badcd0f0c1cec77b6a964bf1fe49e6c72cc39154764a31ec369b9c8d280675ddce835b7339eb"

RPROVIDES:${PN} += "cmake-DFrameworkdbus \
libdframeworkdbus-devel \
pkgconfig-dframeworkdbus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdframeworkdbus2"

inherit rpm
