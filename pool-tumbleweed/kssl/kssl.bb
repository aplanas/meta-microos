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

PV = "5.106.0"

RPM_NAME = "kssl-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c301cb587a753934c30a25f750d99c221baf25fa654167433d76679fdd5858760da6339ff0c82419646a6ebda39b80e1ee04e8a49513248d94fe99b4f46cdbc0"

RPROVIDES:${PN} += "kssl \
kssl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
