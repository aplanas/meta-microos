SUMMARY = "Qt 6 PrintSupport library"
DESCRIPTION = "An abstraction over the platform-specific printing systems. Using \
this library, Qt applications can print to attached printers and \
across networks to remote printers. Qt's printing system also \
supports PDF file generation, providing the foundation for basic \
report generation facilities."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6PrintSupport6-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "081cfd9a5d998b033b0af9c68f761d374c34c73062ed9e8e26908db3d14105e5aaa63f89ef7669d7de887d979e43cbc78691fbf473232f2094a6e93959434eb6"

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
