SUMMARY = "Qt 5 Print Support Library"
DESCRIPTION = "An abstraction over the platform-specific printing systems. Using \
this library, Qt applications can print to attached printers and \
across networks to remote printers. Qt's printing system also \
supports PDF file generation, providing the foundation for basic \
report generation facilities."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5PrintSupport5-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "e2d920c7e9c61d334979e14a3a3048eab9a7fd66d15e86d3244927f7e977b7743244b42a3c1411ca5fa44ebbaa68fbc235fbdd6ce8335d85c08733e75fd00ba8"

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
