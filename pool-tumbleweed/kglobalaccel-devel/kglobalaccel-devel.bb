SUMMARY = "Global desktop keyboard shortcuts: Build Environment"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kglobalaccel-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "9175f3c17b57176b7e70134fa30420e94d326d3e7b1829fbaff231c210d25c571dae951fceb7a5a8cfa50526b6c6bd33d6466bb491ef090927abbf4ebfea12ea"

RPROVIDES:${PN} += "cmake-KF5GlobalAccel \
kglobalaccel-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
cmake-Qt5Widgets \
extra-cmake-modules \
libKF5GlobalAccel5 \
libKF5GlobalAccelPrivate5"

inherit rpm
