SUMMARY = "Helper library to speed up start of applications on KDE workspaces"
DESCRIPTION = "Kdeinit is a process launcher somewhat similar to the famous init used for \
booting UNIX."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kinit-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "ab6e9d1bc502754f4332312b8b2afa615a12f6d557e6c0361e4da168c9f045cda450ff94a225ea553b2aceb8ed62986836e6a85268c3ad8e9909a4b1db80ceb3"

RPROVIDES:${PN} += "kinit \
libkdeinit5-klauncher.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5Service.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libX11.so.6 \
libc.so.6 \
libcap.so.2 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
