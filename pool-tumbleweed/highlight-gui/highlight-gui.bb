SUMMARY = "Graphical Interface for highlight"
DESCRIPTION = "This package provides graphical interface for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.8"

RPM_NAME = "highlight-gui-4.8-1.1.aarch64.rpm"
RPM_HASH = "1a0cc65b0f0bd156a92b149debb8bc5617e4fddaa8e09cdfda0e215e4e3ba28a4909bdce8380289bbcc720b4740133fc46d388339a59b576e1eeb66fdc14662e"

RPROVIDES:${PN} += "highlight-gui"

RDEPENDS:${PN} += "highlight-common \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
