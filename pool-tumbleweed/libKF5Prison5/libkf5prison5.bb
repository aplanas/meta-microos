SUMMARY = "Barcode abstraction layer library"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data."
LICENSE = "MIT"

PV = "5.106.0"

RPM_NAME = "libKF5Prison5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "24695232f0a3d68ee0b575afc5cbc497117064160f4bced3e79d9c2f60c00f90342b4d06d727e8c86d001f76a72857da7668fcb07bd28a2d1baf0fb011e58e1f"

RPROVIDES:${PN} += "libKF5Prison.so.5()(64bit) \
libKF5Prison5 \
libKF5Prison5(aarch-64) \
libKF5PrisonScanner.so.5()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libZXing.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdmtx.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libqrencode.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
