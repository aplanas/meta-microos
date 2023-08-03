SUMMARY = "Qt 6 PrintSupport library"
DESCRIPTION = "An abstraction over the platform-specific printing systems. Using \
this library, Qt applications can print to attached printers and \
across networks to remote printers. Qt's printing system also \
supports PDF file generation, providing the foundation for basic \
report generation facilities."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6PrintSupport6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "649bc011106e90c62da2f3090c9ea12174a603440bf5eaec8c456b090062891dbf52b6c0e6e9cf59bce354b0901a50abf648493338d3a0c42b9a84305ce54f19"

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
