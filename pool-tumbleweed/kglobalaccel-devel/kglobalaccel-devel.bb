SUMMARY = "Global desktop keyboard shortcuts: Build Environment"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kglobalaccel-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "7009290e22fbea91c49bca1157ad2d785882e11bd3ff03867bbce5014f493bd08cc0b6ade9a1167f43b1c2b818b4afc55ce5a1e9600cefe03835b2100a855a84"

RPROVIDES:${PN} += "cmake-KF5GlobalAccel \
kglobalaccel-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
cmake-Qt5Widgets \
extra-cmake-modules \
libKF5GlobalAccel5 \
libKF5GlobalAccelPrivate5"

inherit rpm
