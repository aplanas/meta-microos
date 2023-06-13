SUMMARY = "LaTeX editor"
DESCRIPTION = "Texmaker is a LaTeX editor that integrates many tools \
needed to develop documents with LaTeX in just one application. \
 \
Texmaker includes unicode support, spell checking, auto-completion, \
code folding and a built-in PDF viewer with synctex support and \
continuous view mode."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "5.1.3"

RPM_NAME = "texmaker-5.1.3-1.11.aarch64.rpm"
RPM_HASH = "b2bfd8a6ad85faf73e65311b5c9db09115c77bb1cf53546aa2c2750aca5e0e9f67cd73a69cce7b0dd9ee3af20e54b2edf74ef98afb0cebfeaf6432f6f2200f4a"

RPROVIDES:${PN} += "application() \
application(texmaker.desktop) \
metainfo() \
metainfo(texmaker.metainfo.xml) \
mimehandler(text/x-tex) \
texmaker \
texmaker(aarch-64)"

RDEPENDS:${PN} += "hunspell \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
texlive-collection-latexrecommended \
web_browser \
xdg-utils"

inherit rpm
