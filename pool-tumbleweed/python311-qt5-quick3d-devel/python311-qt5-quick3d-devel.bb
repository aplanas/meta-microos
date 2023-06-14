SUMMARY = "PyQt - devel part of python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtQuick3D"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python311-qt5-quick3d-devel-5.15.9-1.4.aarch64.rpm"
RPM_HASH = "ba752433662af42105135001c12dfad30c060771375f052840a1e33d104a4e126a3381aa66cbee11adccf1b010481dc4771f27837c2135d8d76fee3a0940a976"

RPROVIDES:${PN} += "python311-qt5-quick3d-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5Quick3D \
python-abi \
python311-qt5-devel"

inherit rpm
