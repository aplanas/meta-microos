SUMMARY = "Multi-purpose cross-platform desktop calculator"
DESCRIPTION = "Qalculate! is a multi-purpose cross-platform desktop calculator. It is \
simple to use but provides power and versatility normally reserved for \
complicated math packages, as well as useful tools for everyday needs \
(such as currency conversion and percent calculation). Features include a \
large library of customizable functions, unit calculations and conversion, \
symbolic calculations (including integrals and equations), arbitrary \
precision, uncertainty propagation, interval arithmetic, plotting, and a \
user-friendly interface (QT, GTK+ and CLI)."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "qalculate-qt-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "446c40960827a7de9b5bb6d873d3e348d2ca6bfb3842bb9c66717698a20c9a11f867e1763dced310cadc358d942daa4e063a9239fd6d7d5ec546b5de5a1248a9"

RPROVIDES:${PN} += "qalculate-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqalculate.so.22 \
libstdc++.so.6"

inherit rpm
