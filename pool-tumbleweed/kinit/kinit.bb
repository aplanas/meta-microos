SUMMARY = "Helper library to speed up start of applications on KDE workspaces"
DESCRIPTION = "Kdeinit is a process launcher somewhat similar to the famous init used for \
booting UNIX."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kinit-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "65e4f49e84328e5986f8db138703de867dffb80a10f4d87b2936d8e3abcedf4298c655ff13548b9548707afba56939fcc4a35e4a0a71bea7e322602e30533479"

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
