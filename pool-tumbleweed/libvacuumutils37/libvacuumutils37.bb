SUMMARY = "Shared library libvacuumutils for Vacuum-IM"
DESCRIPTION = "This package includes shared libraris needed to work Vacuum-IM program."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1571036065.9f3952b2"

RPM_NAME = "libvacuumutils37-1.3.0+git1571036065.9f3952b2-1.20.aarch64.rpm"
RPM_HASH = "546d43af5906777d30e7c20afad53a9859f0205ba0672c7b438ca244c1fcd3b40bb84552c3e79e73b6d83a1a00135e3d45e64c7a349358a4bb1c7a0dc9a29385"

RPROVIDES:${PN} += "libvacuumutils.so.37()(64bit) \
libvacuumutils37 \
libvacuumutils37(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXss.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libminizip.so.1()(64bit) \
libqxtglobalshortcut.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
