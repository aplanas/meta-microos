SUMMARY = "PyQt - devel part of python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtQuick3D"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python310-qt5-quick3d-devel-5.15.9-3.1.aarch64.rpm"
RPM_HASH = "e5e5d1f8bae6152429a4c5379555fed4069b91023c986ce983388b09917c24eaac6545587925b12cb75992b097782cf5223a048f05674b04c109ba43427a370f"

RPROVIDES:${PN} += "python310-qt5-quick3d-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5Quick3D \
python-abi \
python310-qt5-devel"

inherit rpm
