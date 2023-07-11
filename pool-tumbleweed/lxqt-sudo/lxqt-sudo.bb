SUMMARY = "GUI frontend for sudo"
DESCRIPTION = "A graphical frontend for plain sudo (for requesting optional password in GUI \
fashion). \
When invoked it simply spawns child sudo process with requested command (and \
arguments). If sudo requests user's password, the GUI password dialog is shown \
and (after submit) the password is provided to sudo."
LICENSE = "LGPL-2.1-only"

PV = "1.3.0"

RPM_NAME = "lxqt-sudo-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "968dfbb8f45f89498b8db597fba60adb19f1d6ac3140b8d842b331d48308141b7ece94a84907ce014646885c4b64156a413260ee2f1374624430f39b1990e8a4"

RPROVIDES:${PN} += "lxqt-sudo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
liblxqt.so.1 \
libstdc++.so.6 \
sudo"

inherit rpm
