SUMMARY = "Translations for package sharutils"
DESCRIPTION = "Provides translations for the 'sharutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.15.2"

RPM_NAME = "sharutils-lang-4.15.2-7.7.noarch.rpm"
RPM_HASH = "fb2e1cc9c4838dc7977b223830a3fdb29d7fa5ffa8273000d07f4316b8411e63cefd5648db3ba8beab0f89aa9c44e24c7d7012f1a94d3f64cae24a13bd2a022d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-sharutils-bg \
locale-sharutils-ca \
locale-sharutils-cs \
locale-sharutils-da \
locale-sharutils-de \
locale-sharutils-el \
locale-sharutils-eo \
locale-sharutils-es \
locale-sharutils-et \
locale-sharutils-fi \
locale-sharutils-fr \
locale-sharutils-ga \
locale-sharutils-gl \
locale-sharutils-hu \
locale-sharutils-id \
locale-sharutils-it \
locale-sharutils-ja \
locale-sharutils-nl \
locale-sharutils-pl \
locale-sharutils-pt-BR \
locale-sharutils-ru \
locale-sharutils-sr \
locale-sharutils-sv \
locale-sharutils-tr \
locale-sharutils-uk \
locale-sharutils-vi \
locale-sharutils-zh-CN \
locale-sharutils-zh-TW \
sharutils-lang \
sharutils-lang-all"

RDEPENDS:${PN} += "sharutils"

inherit rpm
