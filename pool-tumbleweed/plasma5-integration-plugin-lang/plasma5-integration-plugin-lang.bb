SUMMARY = "Translations for package plasma5-integration-plugin"
DESCRIPTION = "Provides translations for the 'plasma5-integration-plugin' package."
LICENSE = "GPL-2.0+"

PV = "5.27.6"

RPM_NAME = "plasma5-integration-plugin-lang-5.27.6-1.1.noarch.rpm"
RPM_HASH = "02b8c15f23f6dcfadc14d23715dfc548b9932a8fd7c13fe9d0eac5f24117ff3a54f007a25eaba3c069c9a19b4336bfca3b8a440b15a33bc726e143b5fadef7a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma5-integration-plugin-ar \
locale-plasma5-integration-plugin-az \
locale-plasma5-integration-plugin-bg \
locale-plasma5-integration-plugin-ca \
locale-plasma5-integration-plugin-ca@valencia \
locale-plasma5-integration-plugin-cs \
locale-plasma5-integration-plugin-da \
locale-plasma5-integration-plugin-de \
locale-plasma5-integration-plugin-el \
locale-plasma5-integration-plugin-en-GB \
locale-plasma5-integration-plugin-es \
locale-plasma5-integration-plugin-et \
locale-plasma5-integration-plugin-eu \
locale-plasma5-integration-plugin-fi \
locale-plasma5-integration-plugin-fr \
locale-plasma5-integration-plugin-gl \
locale-plasma5-integration-plugin-he \
locale-plasma5-integration-plugin-hi \
locale-plasma5-integration-plugin-hu \
locale-plasma5-integration-plugin-ia \
locale-plasma5-integration-plugin-id \
locale-plasma5-integration-plugin-it \
locale-plasma5-integration-plugin-ja \
locale-plasma5-integration-plugin-ka \
locale-plasma5-integration-plugin-ko \
locale-plasma5-integration-plugin-lt \
locale-plasma5-integration-plugin-ml \
locale-plasma5-integration-plugin-nb \
locale-plasma5-integration-plugin-nl \
locale-plasma5-integration-plugin-nn \
locale-plasma5-integration-plugin-pa \
locale-plasma5-integration-plugin-pl \
locale-plasma5-integration-plugin-pt \
locale-plasma5-integration-plugin-pt-BR \
locale-plasma5-integration-plugin-ro \
locale-plasma5-integration-plugin-ru \
locale-plasma5-integration-plugin-sk \
locale-plasma5-integration-plugin-sl \
locale-plasma5-integration-plugin-sr \
locale-plasma5-integration-plugin-sr@ijekavian \
locale-plasma5-integration-plugin-sr@ijekavianlatin \
locale-plasma5-integration-plugin-sr@latin \
locale-plasma5-integration-plugin-sv \
locale-plasma5-integration-plugin-ta \
locale-plasma5-integration-plugin-tr \
locale-plasma5-integration-plugin-uk \
locale-plasma5-integration-plugin-vi \
locale-plasma5-integration-plugin-zh-CN \
locale-plasma5-integration-plugin-zh-TW \
plasma5-integration-plugin-lang \
plasma5-integration-plugin-lang-all"

RDEPENDS:${PN} += "plasma5-integration-plugin"

inherit rpm
