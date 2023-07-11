SUMMARY = "LaTeX editor"
DESCRIPTION = "Texmaker is a LaTeX editor that integrates many tools \
needed to develop documents with LaTeX in just one application. \
 \
Texmaker includes unicode support, spell checking, auto-completion, \
code folding and a built-in PDF viewer with synctex support and \
continuous view mode."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "5.1.4"

RPM_NAME = "texmaker-5.1.4-1.2.aarch64.rpm"
RPM_HASH = "63a2c306dc6e351431e68024e0cf4a74c0355e4a08ae062dd165c8caf23eaaf6c7792a6c9bd850c367e39d419ab366cf04a9e6fc5c1f0e924a2df23a100014cc"

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
