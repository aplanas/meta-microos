SUMMARY = "Tag utility library for LeechCraft"
DESCRIPTION = "A library providing some classes and functions commonly used \
with the LeechCraft tags subsystem."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-tags-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "d68867a7a004c6b0a5db1751f64267ff7825019b07df218904b15087d29e6c856128a3e0b0484ed64f7d016e0784e7eeebce05f7cc80fcdcfc792129577bfbc4"

RPROVIDES:${PN} += "libleechcraft-util-tags-qt5-0-6-75-1 \
libleechcraft-util-tags-qt5.so.0.6.75.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
