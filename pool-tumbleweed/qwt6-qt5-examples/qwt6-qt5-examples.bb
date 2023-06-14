SUMMARY = "Example programs using Qwt(Qt5)"
DESCRIPTION = "This package contains example programs demonstrating the Qwt(Qt5) widgets."
LICENSE = "SUSE-QWT-1.0 | BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "qwt6-qt5-examples-6.2.0-2.1.aarch64.rpm"
RPM_HASH = "1c3346aeefa9fd4f4f74176dc5e9a7015b9e2a24d2a404092c35cb5b1272d28888909e2b9fb959bc8d0c7022cee8f91f6f7cad867d6704906d107c26c2f7df5a"

RPROVIDES:${PN} += "qwt6-qt5-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqwt-qt5.so.6.2 \
libstdc++.so.6 \
qwt6-qt5-devel"

inherit rpm
