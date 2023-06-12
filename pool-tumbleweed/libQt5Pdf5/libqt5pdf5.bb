SUMMARY = "Qt5 PDF library"
DESCRIPTION = "Main library of the Qt PDF module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libQt5Pdf5-5.15.14-1.1.aarch64.rpm"
RPM_HASH = "9589724b69e2d0638ed4fc957d33bc7073172fdb83b4374a7fb98b452ab047ee5ce556b017ac2b79c6d36ef88f339aae1daa05bab4e5d13061d7e07a2f528338"

RPROVIDES:${PN} += "libQt5Pdf.so.5()(64bit) \
libQt5Pdf.so.5(Qt_5)(64bit) \
libQt5Pdf.so.5(Qt_5.0)(64bit) \
libQt5Pdf.so.5(Qt_5.1)(64bit) \
libQt5Pdf.so.5(Qt_5.10)(64bit) \
libQt5Pdf.so.5(Qt_5.11)(64bit) \
libQt5Pdf.so.5(Qt_5.12)(64bit) \
libQt5Pdf.so.5(Qt_5.13)(64bit) \
libQt5Pdf.so.5(Qt_5.14)(64bit) \
libQt5Pdf.so.5(Qt_5.15)(64bit) \
libQt5Pdf.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Pdf.so.5(Qt_5.2)(64bit) \
libQt5Pdf.so.5(Qt_5.3)(64bit) \
libQt5Pdf.so.5(Qt_5.4)(64bit) \
libQt5Pdf.so.5(Qt_5.5)(64bit) \
libQt5Pdf.so.5(Qt_5.6)(64bit) \
libQt5Pdf.so.5(Qt_5.7)(64bit) \
libQt5Pdf.so.5(Qt_5.8)(64bit) \
libQt5Pdf.so.5(Qt_5.9)(64bit) \
libQt5Pdf5 \
libQt5Pdf5(aarch-64) \
libqpdf.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libfreetype.so.6()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
