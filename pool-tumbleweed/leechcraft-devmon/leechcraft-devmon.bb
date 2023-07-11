SUMMARY = "LeechCraft Device Monitor Module"
DESCRIPTION = "This package provides a devices monitor plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-devmon-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "f6e1db8ff46b15477878cae383e8fa242e6b0149b473129ea5522f42392fadc13dd33aeab58ac2bd5c1df6ba1009feec126ace6e29a3274583f952e48791b48d"

RPROVIDES:${PN} += "leechcraft-devmon \
libleechcraft-devmon.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
