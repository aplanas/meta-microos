SUMMARY = "Qt-based text editor with image viewer"
DESCRIPTION = "TEA is a Qt-based text editor. It supports reading FB2, ODT, RTF, \
DOCX, Abiword, KWord KWD and SWX documents, though only writes out \
plaintext. Image viewing is possible as well. It has a built-in \
Midnight-Commander-style file manager, integrates spell checking \
(aspell/hunspell), and syntax highlighting for a number of languages."
LICENSE = "GPL-3.0-or-later"

PV = "61.2.0"

RPM_NAME = "tea-61.2.0-1.3.aarch64.rpm"
RPM_HASH = "95bd7d32ff8eed174cdf94966043fd59180f9f43f0c98c650d6d0e062a134fa88ab661a77e0d27604951c4c564babf78531b5f67c73010c33580ceccb5040051"

RPROVIDES:${PN} += "application() \
application(org.semiletov.tea.desktop) \
metainfo() \
metainfo(org.semiletov.tea.metainfo.xml) \
mimehandler(application/epub+zip) \
mimehandler(application/fb2) \
mimehandler(application/rtf) \
mimehandler(application/vnd.oasis.opendocument.text) \
mimehandler(application/vnd.openxmlformats-officedocument.wordprocessingml.document) \
mimehandler(application/x-tex) \
mimehandler(text/plain) \
tea \
tea(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.4)(64bit) \
libQt6Core5Compat.so.6()(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhunspell-1.7.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
