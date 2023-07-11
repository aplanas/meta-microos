SUMMARY = "LeechCraft CPU Usage Monitoring Module"
DESCRIPTION = "This package provides a quark for monitoring the CPU usage \
for LeechCraft SB2. It currently uses /proc/stat."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-cpuload-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "86236eda57662139fd56d81c2bea4079aacdd6b65e6fc1178a8f1bbe775cd072b6ea869716372daeabdfff95b15e36346f5024179a19fa38c25423b3da4ff2b6"

RPROVIDES:${PN} += "leechcraft-cpuload \
libleechcraft-cpuload.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
