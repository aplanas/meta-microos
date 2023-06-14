SUMMARY = "Qt 5 Print Support Library"
DESCRIPTION = "An abstraction over the platform-specific printing systems. Using \
this library, Qt applications can print to attached printers and \
across networks to remote printers. Qt's printing system also \
supports PDF file generation, providing the foundation for basic \
report generation facilities."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5PrintSupport5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "2c067b1a25714c913658be9167ace9e093163d84f9e7ecba00093970fcc4f47a0981f42244610007c2839e654f43b1f550a178c8f5c764c3deba625f1591c184"

RPROVIDES:${PN} += "libQt5PrintSupport.so.5 \
libQt5PrintSupport5 \
libcupsprintersupport.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libcups.so.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
