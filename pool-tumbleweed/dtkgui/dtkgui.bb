SUMMARY = "Deepin Toolkit GUI"
DESCRIPTION = "A GUI module for DDE look and feel for the Deepin Toolkit."
LICENSE = "LGPL-3.0"

PV = "5.5.25"

RPM_NAME = "dtkgui-5.5.25-1.9.aarch64.rpm"
RPM_HASH = "7bfbbb0d22a76f9b8e0804b8428cca0e6ef4d10dbdbef31a7bf0d2ebbe08d48c66c83bfef4a4d2570e32b4fee47eca9351c106cd0ddcc1edf233512efde310a6"

RPROVIDES:${PN} += "dtkgui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
