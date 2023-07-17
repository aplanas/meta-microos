SUMMARY = "Helper library to speed up start of applications on KDE workspaces"
DESCRIPTION = "Kdeinit is a process launcher somewhat similar to the famous init used for \
booting UNIX."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kinit-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "758130ecae4fa77bd5e94dc7f8bc1d458e54d2fae5a111a98d0a4d781b712497d145c8e759f31c251b02854dbc94cd06728924e78b7a76f1aebaa2e0e91b1663"

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
