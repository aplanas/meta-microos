SUMMARY = "GUI frontend for sudo"
DESCRIPTION = "A graphical frontend for plain sudo (for requesting optional password in GUI \
fashion). \
When invoked it simply spawns child sudo process with requested command (and \
arguments). If sudo requests user's password, the GUI password dialog is shown \
and (after submit) the password is provided to sudo."
LICENSE = "LGPL-2.1-only"

PV = "1.3.0"

RPM_NAME = "lxqt-sudo-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "f909b31ec5e74b5008759d412cda536e67134267381b181de5f60385fce49b16fe87b67863250f8d1e890df2f134782177101894fcc394d31582cef9b34e7bd5"

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
