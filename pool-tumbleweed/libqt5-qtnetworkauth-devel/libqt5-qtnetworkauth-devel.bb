SUMMARY = "Development files for the Qt5 NetworkAuth Library"
DESCRIPTION = "Qt Network Authorization provides a set of APIs that enable Qt \
applications to obtain limited access to online accounts and HTTP \
services without exposing users' passwords. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libQt5NetworkAuth5."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtnetworkauth-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "b371672408c61e21925b4fbf7627a732d1dd79db13e4ec818e46e73cbb303036130abf4c775a824ec85606b64fa741d12d8708def3dd284c37363b00c9f0a58e"

RPROVIDES:${PN} += "cmake-Qt5NetworkAuth \
libqt5-qtnetworkauth-devel \
pkgconfig-Qt5NetworkAuth"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5NetworkAuth5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
