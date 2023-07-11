SUMMARY = "Translations for package plasma5-bigscreen"
DESCRIPTION = "Provides translations for the 'plasma5-bigscreen' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "plasma5-bigscreen-lang-5.27.6-1.1.noarch.rpm"
RPM_HASH = "47c3dd0d38315ef7a3b05e9877fda315c785332877ca2b14a5104a21ed72914038ed89702f76b92b7e46bfcfae2061b4896000390cee5ee8b4d97916af4369d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma5-bigscreen-ar \
locale-plasma5-bigscreen-az \
locale-plasma5-bigscreen-bg \
locale-plasma5-bigscreen-ca \
locale-plasma5-bigscreen-ca@valencia \
locale-plasma5-bigscreen-cs \
locale-plasma5-bigscreen-da \
locale-plasma5-bigscreen-de \
locale-plasma5-bigscreen-el \
locale-plasma5-bigscreen-en-GB \
locale-plasma5-bigscreen-es \
locale-plasma5-bigscreen-et \
locale-plasma5-bigscreen-eu \
locale-plasma5-bigscreen-fi \
locale-plasma5-bigscreen-fr \
locale-plasma5-bigscreen-gl \
locale-plasma5-bigscreen-hu \
locale-plasma5-bigscreen-ia \
locale-plasma5-bigscreen-id \
locale-plasma5-bigscreen-it \
locale-plasma5-bigscreen-ja \
locale-plasma5-bigscreen-ka \
locale-plasma5-bigscreen-ko \
locale-plasma5-bigscreen-lt \
locale-plasma5-bigscreen-nl \
locale-plasma5-bigscreen-nn \
locale-plasma5-bigscreen-pa \
locale-plasma5-bigscreen-pl \
locale-plasma5-bigscreen-pt \
locale-plasma5-bigscreen-pt-BR \
locale-plasma5-bigscreen-ro \
locale-plasma5-bigscreen-ru \
locale-plasma5-bigscreen-sk \
locale-plasma5-bigscreen-sl \
locale-plasma5-bigscreen-sv \
locale-plasma5-bigscreen-tr \
locale-plasma5-bigscreen-uk \
locale-plasma5-bigscreen-zh-CN \
locale-plasma5-bigscreen-zh-TW \
plasma5-bigscreen-lang \
plasma5-bigscreen-lang-all"

RDEPENDS:${PN} += "plasma5-bigscreen"

inherit rpm
