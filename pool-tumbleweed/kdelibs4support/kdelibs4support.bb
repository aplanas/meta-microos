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
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kdelibs4support-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "3b54c37dff6132cfc025d429ce78d80fc417a9657cb3bd0e59d188d8ce798db016621a5b274ade6edd13e529f74b5d355f8b423a5ebc3053575b264a198a43fc"

RPROVIDES:${PN} += "kde4support \
kdelibs4support"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5KDELibs4Support.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
