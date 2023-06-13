SUMMARY = "Qt6 wrapper for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.05.0"

RPM_NAME = "libpoppler-qt6-3-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "bf6abae0687aed65d1924911823d20304af26444018fcf865c7fa500e7fd2068516854db7570e50dcabe60b325ceec49d6ec383c1d50071ec078b05f928dfa2d"

RPROVIDES:${PN} += "libpoppler-qt6-3 \
libpoppler-qt6-3(aarch-64) \
libpoppler-qt6.so.3()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libfreetype.so.6()(64bit) \
liblcms2.so.2()(64bit) \
libpoppler.so.128()(64bit) \
libpoppler128 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
