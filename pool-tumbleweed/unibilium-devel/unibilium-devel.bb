SUMMARY = "Development files for unibilium, a terminfo parsing library"
DESCRIPTION = "Unibilium is a very basic terminfo library. It doesn't depend on curses or any \
other library. It also doesn't use global variables, so it should be \
thread-safe. \
 \
This package holds the development files."
LICENSE = "LGPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "unibilium-devel-2.1.1-1.8.aarch64.rpm"
RPM_HASH = "69510247d35fb6a8656dca643735081a6091f7510b8addac66a5bb4d84a7cb435c3a998974ac019f303e3d497a3fe042452581eb07b6b5f4ca22e12306d57f86"

RPROVIDES:${PN} += "pkgconfig-unibilium \
unibilium-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libunibilium4"

inherit rpm
