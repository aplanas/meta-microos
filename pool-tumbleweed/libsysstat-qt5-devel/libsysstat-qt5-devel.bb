SUMMARY = "Devel files for libsysstat"
DESCRIPTION = "sysstat libraries for development."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.6"

RPM_NAME = "libsysstat-qt5-devel-0.4.6-1.9.aarch64.rpm"
RPM_HASH = "4faa2cce2b313674cf6004f04d74e639f3039e7aa321ba992b9ba88511dbc475e41cce1dbe18ac0cd3a22efc67743c021aa115bf067e60e75da70836bca6b49c"

RPROVIDES:${PN} += "cmake-sysstat-qt5 \
libsysstat-qt5-devel \
pkgconfig-sysstat-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsysstat-qt5-0 \
pkgconfig \
pkgconfig-Qt5Core"

inherit rpm
