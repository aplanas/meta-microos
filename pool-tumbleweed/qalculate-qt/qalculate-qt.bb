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

RPM_NAME = "qalculate-qt-4.6.1-1.2.aarch64.rpm"
RPM_HASH = "4d908c8d1a990b6e0a74b27a821bde5bac15c7151b35ac9131e0cf262a8ac8f3e38821b2cba335f0d80c1325b95f1788371e5571f90a72247c5f4a7aaf305697"

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
