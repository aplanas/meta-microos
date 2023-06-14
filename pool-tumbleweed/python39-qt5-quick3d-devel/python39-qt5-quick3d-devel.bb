SUMMARY = "PyQt - devel part of python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtQuick3D"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python39-qt5-quick3d-devel-5.15.9-1.4.aarch64.rpm"
RPM_HASH = "abb8d162e2ab573d5c1faeed3131f8775c265619df349466c8dacdda9a4224d13fc08e800fe17ba9c57da90b15c929d3d2749873c7cf51336a44dba40d65f14d"

RPROVIDES:${PN} += "python39-qt5-quick3d-devel"

RDEPENDS:${PN} += "pkgconfig-Qt5Quick3D \
python-abi \
python39-qt5-devel"

inherit rpm
