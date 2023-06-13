SUMMARY = "Qt6 Pdf library"
DESCRIPTION = "The Qt6 Pdf library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Pdf6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f1008607b9007031a0255808de2396541fc6ce2d6c6bf4af1eef752f8060fdb91b81251f389d16eaf8aa4c65e70f4200ad8263f67ef4bcd80e250abbc51bb5d6"

RPROVIDES:${PN} += "libQt6Pdf.so.6()(64bit) \
libQt6Pdf.so.6(Qt_6)(64bit) \
libQt6Pdf6 \
libQt6Pdf6(aarch-64) \
libqpdf.so()(64bit) \
libqpdf.so(Qt_6)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libopenjp2.so.7()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
