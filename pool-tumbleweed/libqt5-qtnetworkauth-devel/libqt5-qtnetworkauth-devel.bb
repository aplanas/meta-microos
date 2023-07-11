SUMMARY = "Development files for the Qt5 NetworkAuth Library"
DESCRIPTION = "Qt Network Authorization provides a set of APIs that enable Qt \
applications to obtain limited access to online accounts and HTTP \
services without exposing users' passwords. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libQt5NetworkAuth5."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtnetworkauth-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "c07b45036971c998b79cbb850e650f8f5a7c832ddae31867d8bd47691caef315bffce6ed86c9f9f28fb78d17fbc2367011964b4fa1b5509ed09d6168261daae3"

RPROVIDES:${PN} += "cmake-Qt5NetworkAuth \
libqt5-qtnetworkauth-devel \
pkgconfig-Qt5NetworkAuth"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5NetworkAuth5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
