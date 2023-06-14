SUMMARY = "LeechCraft CPU Usage Monitoring Module"
DESCRIPTION = "This package provides a quark for monitoring the CPU usage \
for LeechCraft SB2. It currently uses /proc/stat."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-cpuload-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "1b465d19f8c348ae5b63416df7a20a275ab4a5a852c706bd7858ed286e479a10c635e862ddcb4f0cf7dbb7b540b6b6e4279d09b6b724d4fc87a10b6277549f67"

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
