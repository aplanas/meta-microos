SUMMARY = "Global desktop keyboard shortcuts: Build Environment"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kglobalaccel-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "b53f0b7c6a52af74aad841b74607613469e27f0ee5254de5c760e7ee4f36f2242c9f3b986756fad80a675eea545f976b21cc03677c157cafcb85eab84d1269d5"

RPROVIDES:${PN} += "cmake-KF5GlobalAccel \
kglobalaccel-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
cmake-Qt5Widgets \
extra-cmake-modules \
libKF5GlobalAccel5 \
libKF5GlobalAccelPrivate5"

inherit rpm
