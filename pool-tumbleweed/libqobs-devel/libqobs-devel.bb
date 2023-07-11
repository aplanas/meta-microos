SUMMARY = "Development files for libqobs"
DESCRIPTION = "This package contains the development files for libqobs, a Qt-based \
Open Build Service (OBS) library."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "libqobs-devel-2.1.0-2.10.aarch64.rpm"
RPM_HASH = "2a5d0bb57f474398f319a2fd05ea20c2edc89a11e3db6205bc049a16d9342bc9cc98ac6ae9c2aa594191c567a2e29abba22144587aa3dba26af0c5764eabd05c"

RPROVIDES:${PN} += "libqobs-devel \
pkgconfig-libqobs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqobs2 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Network"

inherit rpm
