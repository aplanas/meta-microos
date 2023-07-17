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

RPM_NAME = "libKF5KDELibs4Support5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e9ad4f68011811f76b73ddf6fbee326a92a8a859fe54910e552a3091babc7857fbfc53353116749be5d7375b7d57b3954c2bb81a1b7627f905e3c381cb91fedd"

RPROVIDES:${PN} += "libKF5KDELibs4Support.so.5 \
libKF5KDELibs4Support5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kded \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libKF5Auth.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libSM.so.6 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
