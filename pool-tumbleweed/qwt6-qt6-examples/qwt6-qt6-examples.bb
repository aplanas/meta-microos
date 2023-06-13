SUMMARY = "Example programs using Qwt(Qt6)"
DESCRIPTION = "This package contains example programs demonstrating the Qwt(Qt6) widgets."
LICENSE = "SUSE-QWT-1.0 | BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "qwt6-qt6-examples-6.2.0-2.1.aarch64.rpm"
RPM_HASH = "9c4da65426f70acd090060dc5ce431dfc19c59525d6a379d298550fdabea8dd52fe3cb299be2a20a5315b868beb798d0219c07267feec67863dc5d51350695e8"

RPROVIDES:${PN} += "qwt6-qt6-examples \
qwt6-qt6-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libqwt-qt6.so.6.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qwt6-qt6-devel"

inherit rpm
