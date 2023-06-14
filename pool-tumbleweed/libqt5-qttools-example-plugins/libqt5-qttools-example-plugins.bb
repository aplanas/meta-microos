SUMMARY = "Example plugins for Qt5 Designer"
DESCRIPTION = "Example plugins for Qt5 Designer, e.g. a TicTacToe and a World Clock widget."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qttools-example-plugins-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "e1dd6a3cb4ecc7db7cf2b54a017a0aa68408ec4a2afe815ec93023087bcf7a2fffb7a5ba1638b536ec1136282abb9080f639914c3addbb0f6e88e47d697c9836"

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
