SUMMARY = "Translations for package wxhexeditor"
DESCRIPTION = "Provides translations for the 'wxhexeditor' package."
LICENSE = "GPL-2.0-only"

PV = "0.24"

RPM_NAME = "wxhexeditor-lang-0.24-3.15.noarch.rpm"
RPM_HASH = "de1fc24fbdd7e4e932151baf9e666f832feb6ec4685af96116fca1a626c41c9f9eabbffb9f16f55d561aadcb4cc547a814b2b359cc4b7001e8e407d6ed469bec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wxhexeditor-ar \
locale-wxhexeditor-cs \
locale-wxhexeditor-de \
locale-wxhexeditor-es \
locale-wxhexeditor-fr \
locale-wxhexeditor-it \
locale-wxhexeditor-pl \
locale-wxhexeditor-pt-BR \
locale-wxhexeditor-ro \
locale-wxhexeditor-ru \
locale-wxhexeditor-tr \
locale-wxhexeditor-zh-CN \
wxhexeditor-lang \
wxhexeditor-lang-all"

RDEPENDS:${PN} += "wxhexeditor"

inherit rpm
