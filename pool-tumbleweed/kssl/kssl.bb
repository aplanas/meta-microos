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
KDEDIRS environment variable correctly."
LICENSE = "GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kssl-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "f3fcb1cad06148aa84a75e26916667e039ff21d91172d78d568c4c72571fe42485ce3124fe275474543eaaa27bdd9d849ddc39ec88cdd168bc737f3aa6ffc849"

RPROVIDES:${PN} += "kssl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
