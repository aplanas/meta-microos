SUMMARY = "LeechCraft HTTP authentication Module"
DESCRIPTION = "This package provides providing standard HTTP authentication facilities for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-namauth-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "c417b0b1f1b771a3731090e659b1cdeff1fb2a4aaa41e5ddf50c8e186cd75c40c3d57f935fd44c059b5437214ec2654d621b69d8cd049fe24e09d38ca120a8ec"

RPROVIDES:${PN} += "leechcraft-namauth \
libleechcraft-namauth.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
