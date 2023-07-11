SUMMARY = "LeechCraft Azoth Off-the-Record Module"
DESCRIPTION = "This package provides support for Off-the-Record messaging for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-otroid-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "6e26d5056567eadc1351602c285d045d9355f171d68a9dbae536c4b99eb3eacec7b1ada9147471cb86a884c98cb58efff2216f771446a61f18ba8320dd222aa6"

RPROVIDES:${PN} += "leechcraft-azoth-otroid \
libleechcraft-azoth-otroid.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libotr.so.5 \
libstdc++.so.6"

inherit rpm
