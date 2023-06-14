SUMMARY = "Devel files for libsysstat"
DESCRIPTION = "sysstat libraries for development."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.6"

RPM_NAME = "libsysstat-qt5-devel-0.4.6-1.8.aarch64.rpm"
RPM_HASH = "de835541a8146f566df31d543d56951a86647cc07a97be46c78b63fd6ec1b0e4dbfb24b77ca2238120e253f546654e18ed1f1a84c886c441089d9269e226a57d"

RPROVIDES:${PN} += "cmake-sysstat-qt5 \
libsysstat-qt5-devel \
pkgconfig-sysstat-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsysstat-qt5-0 \
pkgconfig \
pkgconfig-Qt5Core"

inherit rpm
