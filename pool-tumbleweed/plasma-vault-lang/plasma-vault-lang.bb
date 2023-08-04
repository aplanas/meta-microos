SUMMARY = "Translations for package plasma-vault"
DESCRIPTION = "Provides translations for the 'plasma-vault' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma-vault-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "79e2a4babd21ef9a7a81dd375e88c8ef7024df52bfd236879444197e6f6d53341fd08307565f5dc34b770defcc45777218431a807088fdb455fea76845307f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma-vault-ar \
locale-plasma-vault-az \
locale-plasma-vault-bg \
locale-plasma-vault-ca \
locale-plasma-vault-ca@valencia \
locale-plasma-vault-cs \
locale-plasma-vault-da \
locale-plasma-vault-de \
locale-plasma-vault-el \
locale-plasma-vault-en-GB \
locale-plasma-vault-es \
locale-plasma-vault-et \
locale-plasma-vault-eu \
locale-plasma-vault-fi \
locale-plasma-vault-fr \
locale-plasma-vault-gl \
locale-plasma-vault-hu \
locale-plasma-vault-ia \
locale-plasma-vault-id \
locale-plasma-vault-it \
locale-plasma-vault-ja \
locale-plasma-vault-ka \
locale-plasma-vault-ko \
locale-plasma-vault-lt \
locale-plasma-vault-ml \
locale-plasma-vault-nl \
locale-plasma-vault-nn \
locale-plasma-vault-pa \
locale-plasma-vault-pl \
locale-plasma-vault-pt \
locale-plasma-vault-pt-BR \
locale-plasma-vault-ro \
locale-plasma-vault-ru \
locale-plasma-vault-sk \
locale-plasma-vault-sl \
locale-plasma-vault-sr \
locale-plasma-vault-sr@ijekavian \
locale-plasma-vault-sr@ijekavianlatin \
locale-plasma-vault-sr@latin \
locale-plasma-vault-sv \
locale-plasma-vault-tr \
locale-plasma-vault-uk \
locale-plasma-vault-zh-CN \
locale-plasma-vault-zh-TW \
plasma-vault-lang \
plasma-vault-lang-all"

RDEPENDS:${PN} += "plasma-vault"

inherit rpm
