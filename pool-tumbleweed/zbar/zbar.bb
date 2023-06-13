SUMMARY = "Bar code reader"
DESCRIPTION = "ZBar reads bar codes from various sources, such as video streams, \
image files and raw intensity sensors. It supports many symbologies \
(types of bar codes) including EAN-13/UPC-A, UPC-E, EAN-8, Code 128, \
Code 39, Interleaved 2 of 5 and QR Code. \
 \
It can be used through the standalone GUI and command-line programs, \
or integrated by other programs through a library."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "zbar-0.23.90-3.1.aarch64.rpm"
RPM_HASH = "e309b8d9c858fe69c09a6b91295057b4844aa3e28809f7e035d068b4da316afd680aa4750f2afceb9f4b2ecd1c8755b9de2a42e61abee084a4a3d5d02d071165"

RPROVIDES:${PN} += "zbar \
zbar(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libMagickWand-7.Q16HDRI.so.10()(64bit) \
libMagickWand-7.Q16HDRI.so.10(VERS_10.0)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libzbar.so.0()(64bit) \
libzbarqt.so.0()(64bit)"

inherit rpm
