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

RPROVIDES:${PN} += "texmaker"

RDEPENDS:${PN} += "hunspell \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
texlive-collection-latexrecommended \
web-browser \
xdg-utils"

inherit rpm
