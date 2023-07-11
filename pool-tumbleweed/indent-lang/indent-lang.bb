SUMMARY = "Translations for package indent"
DESCRIPTION = "Provides translations for the 'indent' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.13"

RPM_NAME = "indent-lang-2.2.13-1.2.noarch.rpm"
RPM_HASH = "c156fe91ed90536b3d4cf7ae5690ad4a8154c1a73c37f16383addcbcd963e920d326462161e981873765e81ad9bbc66bd52ec58c11a4c0c6555669966a8f2e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "indent-lang \
indent-lang-all \
locale-indent-bg \
locale-indent-ca \
locale-indent-cs \
locale-indent-da \
locale-indent-de \
locale-indent-el \
locale-indent-eo \
locale-indent-es \
locale-indent-et \
locale-indent-eu \
locale-indent-fi \
locale-indent-fr \
locale-indent-ga \
locale-indent-gl \
locale-indent-hr \
locale-indent-hu \
locale-indent-id \
locale-indent-it \
locale-indent-ja \
locale-indent-ko \
locale-indent-nl \
locale-indent-pl \
locale-indent-pt-BR \
locale-indent-ro \
locale-indent-ru \
locale-indent-sk \
locale-indent-sr \
locale-indent-sv \
locale-indent-tr \
locale-indent-uk \
locale-indent-vi \
locale-indent-zh-CN \
locale-indent-zh-TW"

RDEPENDS:${PN} += "indent"

inherit rpm
