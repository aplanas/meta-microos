SUMMARY = "PyQt - devel part of python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtQuick3D"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python311-qt5-quick3d-devel-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "5143d2032580ac852b66709d40d463a285125a505acfb0023058b78d9ba61ea73a332c0bfaab665f6decdae7374b310c428dcc2a38984a97be50a96e8c449038"

RPROVIDES:${PN} += "python3-qt5-quick3d-devel \
python311-qt5-quick3d-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5Quick3D \
python-abi \
python311-qt5-devel"

inherit rpm
