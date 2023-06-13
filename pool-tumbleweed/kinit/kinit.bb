SUMMARY = "Helper library to speed up start of applications on KDE workspaces"
DESCRIPTION = "Kdeinit is a process launcher somewhat similar to the famous init used for \
booting UNIX."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kinit-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "65e4f49e84328e5986f8db138703de867dffb80a10f4d87b2936d8e3abcedf4298c655ff13548b9548707afba56939fcc4a35e4a0a71bea7e322602e30533479"

RPROVIDES:${PN} += "kinit \
kinit(aarch-64) \
libkdeinit5_klauncher.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcap.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
