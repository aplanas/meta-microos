SUMMARY = "Example plugins for Qt5 Designer"
DESCRIPTION = "Example plugins for Qt5 Designer, e.g. a TicTacToe and a World Clock widget."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qttools-example-plugins-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "54380112dbad5a32caec9b90dc7dab7aaeb609b9a535635b89442c5db581618db6ba9450caa1431eeadf7e4784c7c1b8921c19fb1171b071f7af1b047de1e1e9"

RPROVIDES:${PN} += "libcontainerextension.so \
libcustomwidgetplugin.so \
libqt5-qttools-example-plugins \
libtaskmenuextension.so \
libworldtimeclockplugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Designer.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
