SUMMARY = "Example programs using Qwt(Qt5)"
DESCRIPTION = "This package contains example programs demonstrating the Qwt(Qt5) widgets."
LICENSE = "SUSE-QWT-1.0 | BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "qwt6-qt5-examples-6.2.0-2.1.aarch64.rpm"
RPM_HASH = "1c3346aeefa9fd4f4f74176dc5e9a7015b9e2a24d2a404092c35cb5b1272d28888909e2b9fb959bc8d0c7022cee8f91f6f7cad867d6704906d107c26c2f7df5a"

RPROVIDES:${PN} += "qwt6-qt5-examples \
qwt6-qt5-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libqwt-qt5.so.6.2()(64bit) \
libstdc++.so.6()(64bit) \
qwt6-qt5-devel"

inherit rpm
