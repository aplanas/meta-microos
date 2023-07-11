SUMMARY = "Qt 5 Print Support Library"
DESCRIPTION = "An abstraction over the platform-specific printing systems. Using \
this library, Qt applications can print to attached printers and \
across networks to remote printers. Qt's printing system also \
supports PDF file generation, providing the foundation for basic \
report generation facilities."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5PrintSupport5-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "dfe0a14a7ee4c729b6cb3acf345bc6b0add37dd9e58e5abca21c1f761e0680b898767dec30f478d21aa7cf1d34a01d66e1f7671cee5e291006de354db7defb0f"

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
