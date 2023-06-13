SUMMARY = "A system tray 'notification area' dockapp"
DESCRIPTION = "A very simple and light implementation of a system tray for any window \
manager supporting docking, conforming to the System Tray Freedesktop \
standard. \
 \
Peksystray provides a window where icons will automatically add up \
depending on the requests from the applications. Both the size of the \
window and the size of the icons can be selected by the user. If the \
window is full, it can automatically display another window in order \
to display more icons."
LICENSE = "GPL-2.0-only"

PV = "0.4.0"

RPM_NAME = "peksystray-0.4.0-22.18.aarch64.rpm"
RPM_HASH = "02b3bc848bee737911604111d5f30bb2c88605a87d9c0c4b5eb8408b5c3d4f3a9c2b3e6a41196189d95bdd181b5254ed0a44eb7ac26d9ce7cf7cecafda3a03c5"

RPROVIDES:${PN} += "peksystray \
peksystray(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
