SUMMARY = "Translations for package kongress"
DESCRIPTION = "Provides translations for the 'kongress' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "kongress-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "9f8b2c003941eeb0284b3a5f1f9c32e1c6cee13aeef4b8898d602613d362d202495f9c051d23a9f4f5097a0eee329b9857f59e293b5ced8102abb91233bc9832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kongress-lang \
kongress-lang-all \
locale-kongress-ca \
locale-kongress-ca@valencia \
locale-kongress-cs \
locale-kongress-da \
locale-kongress-de \
locale-kongress-el \
locale-kongress-en-GB \
locale-kongress-eo \
locale-kongress-es \
locale-kongress-et \
locale-kongress-eu \
locale-kongress-fi \
locale-kongress-fr \
locale-kongress-gl \
locale-kongress-ia \
locale-kongress-it \
locale-kongress-ja \
locale-kongress-ka \
locale-kongress-ko \
locale-kongress-lt \
locale-kongress-nl \
locale-kongress-nn \
locale-kongress-pa \
locale-kongress-pl \
locale-kongress-pt \
locale-kongress-pt-BR \
locale-kongress-ro \
locale-kongress-ru \
locale-kongress-sk \
locale-kongress-sl \
locale-kongress-sv \
locale-kongress-tr \
locale-kongress-uk \
locale-kongress-zh-CN \
locale-kongress-zh-TW"

RDEPENDS:${PN} += "kongress"

inherit rpm
