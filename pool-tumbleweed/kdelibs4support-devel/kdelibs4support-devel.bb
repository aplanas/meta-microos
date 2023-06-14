SUMMARY = "Code and utilities to ease the transition to KDE Frameworks 5"
DESCRIPTION = "This package includes CMake macros and C++ \
classes whose functionality has been replaced by code in CMake, Qt and \
other frameworks. \
 \
Code should aim to port away from this framework eventually.  The API \
documentation of the classes in this framework and the notes at \
<https://community.kde.org/Frameworks/Porting_Notes> should help with \
this. \
 \
Note that some of the classes in this framework, especially \
KStandardDirs, may not work correctly unless any libraries and other \
software using the KDE4 Support framework are installed to the same \
location as KDELibs4Support, although it may be sufficient to set the \
KDEDIRS environment variable correctly. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kdelibs4support-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "d0476beccc1f2422f9fe03c56b9fbf7f574cdb17603f22c475c31d6431b52842dd52dc49920ffff2ba10a197ea54bf133f6a476d08e3ac3810b8b06f220f8e17"

RPROVIDES:${PN} += "cmake-KF5KDE4Support \
cmake-KF5KDELibs4Support \
kde4support-devel \
kdelibs4support-devel"

RDEPENDS:${PN} += "cmake-KF5Archive \
cmake-KF5Auth \
cmake-KF5ConfigWidgets \
cmake-KF5CoreAddons \
cmake-KF5Crash \
cmake-KF5DBusAddons \
cmake-KF5DesignerPlugin \
cmake-KF5DocTools \
cmake-KF5Emoticons \
cmake-KF5GuiAddons \
cmake-KF5IconThemes \
cmake-KF5Init \
cmake-KF5ItemModels \
cmake-KF5Notifications \
cmake-KF5Parts \
cmake-KF5TextWidgets \
cmake-KF5UnitConversion \
cmake-KF5WindowSystem \
cmake-Qt5Core \
cmake-Qt5DBus \
cmake-Qt5PrintSupport \
cmake-Qt5Xml \
extra-cmake-modules \
kdelibs4support \
libKF5KDELibs4Support5"

inherit rpm
