SUMMARY = "Tag utility library for LeechCraft"
DESCRIPTION = "A library providing some classes and functions commonly used \
with the LeechCraft tags subsystem."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-tags-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "a3e878c891328b7e99d8db3a9ca80e4316613e9eec8d3089e5c466231640cedffdcebee57dcbb8cb1fa9ae41e79237184b9a9ba968547d67152915cf7e9bdb42"

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
