SUMMARY = "PyQt - devel part of python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtQuick3D"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python310-qt5-quick3d-devel-5.15.9-1.4.aarch64.rpm"
RPM_HASH = "ff8790f81f0ff0d322c3c793c693de7bf7a84bda3f34500dc72f0fec1439d44bf0942fe74cae41414de0070938b7afdadcb8d2da8e9ef739d7025ecbf43b13b9"

RPROVIDES:${PN} += "python3-qt5-quick3d-devel \
python310-qt5-quick3d-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5Quick3D \
python-abi \
python310-qt5-devel"

inherit rpm
