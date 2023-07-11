SUMMARY = "PyQt - devel part of python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtQuick3D"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python39-qt5-quick3d-devel-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "a3aa97d4a1ab32e91b697cce2f10acd00c9bc7b2bc46e541c53c214dd091f15cf1dc7cd977e5cac2563bb9d406ed78e01ee803a0a2c4e4c34c329a6b3edbdd6f"

RPROVIDES:${PN} += "python39-qt5-quick3d-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5Quick3D \
python-abi \
python39-qt5-devel"

inherit rpm
