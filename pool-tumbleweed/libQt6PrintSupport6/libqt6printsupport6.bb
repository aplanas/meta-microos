SUMMARY = "Qt 6 PrintSupport library"
DESCRIPTION = "An abstraction over the platform-specific printing systems. Using \
this library, Qt applications can print to attached printers and \
across networks to remote printers. Qt's printing system also \
supports PDF file generation, providing the foundation for basic \
report generation facilities."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6PrintSupport6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "65d0ad752b3bbbdf61cf3a6ce7571d2417ee65c7a81646e12d4233c24487dd445b61e2664983d7871259492ee56f2bf735741c86e9fe3aa2148564356e691bb9"

RPROVIDES:${PN} += "libQt6PrintSupport.so.6 \
libQt6PrintSupport6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Widgets6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
