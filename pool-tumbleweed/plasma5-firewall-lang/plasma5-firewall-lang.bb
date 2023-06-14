SUMMARY = "Translations for package plasma5-firewall"
DESCRIPTION = "Provides translations for the 'plasma5-firewall' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "plasma5-firewall-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "5f7d11f26c95a38b20ac7451db117fba2cda5dd6c59baf1fd5c9e63de0397c635517557c3766165dffedc2c48d4ce31e1457b5993420edc002b424f729680dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma5-firewall-ar \
locale-plasma5-firewall-az \
locale-plasma5-firewall-bg \
locale-plasma5-firewall-ca \
locale-plasma5-firewall-ca@valencia \
locale-plasma5-firewall-cs \
locale-plasma5-firewall-da \
locale-plasma5-firewall-de \
locale-plasma5-firewall-en-GB \
locale-plasma5-firewall-es \
locale-plasma5-firewall-et \
locale-plasma5-firewall-eu \
locale-plasma5-firewall-fi \
locale-plasma5-firewall-fr \
locale-plasma5-firewall-hu \
locale-plasma5-firewall-ia \
locale-plasma5-firewall-id \
locale-plasma5-firewall-it \
locale-plasma5-firewall-ja \
locale-plasma5-firewall-ka \
locale-plasma5-firewall-ko \
locale-plasma5-firewall-lt \
locale-plasma5-firewall-nl \
locale-plasma5-firewall-nn \
locale-plasma5-firewall-pl \
locale-plasma5-firewall-pt \
locale-plasma5-firewall-pt-BR \
locale-plasma5-firewall-ro \
locale-plasma5-firewall-ru \
locale-plasma5-firewall-sk \
locale-plasma5-firewall-sl \
locale-plasma5-firewall-sv \
locale-plasma5-firewall-tr \
locale-plasma5-firewall-uk \
locale-plasma5-firewall-zh-CN \
locale-plasma5-firewall-zh-TW \
plasma5-firewall-lang \
plasma5-firewall-lang-all"

RDEPENDS:${PN} += "plasma5-firewall"

inherit rpm
