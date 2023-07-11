SUMMARY = "Translations for package plasma5-systemmonitor"
DESCRIPTION = "Provides translations for the 'plasma5-systemmonitor' package."
LICENSE = "GPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "plasma5-systemmonitor-lang-5.27.6-1.1.noarch.rpm"
RPM_HASH = "44fc6c85b63ad0ebc50a8b38002a89ae0b516ee857d3dd9fef08b7c265fdd800cbb40f5d87c8cd71ace6b1c3d60095461eb26432ba1ba9438d1302dbf8e29102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma5-systemmonitor-ar \
locale-plasma5-systemmonitor-az \
locale-plasma5-systemmonitor-bg \
locale-plasma5-systemmonitor-ca \
locale-plasma5-systemmonitor-ca@valencia \
locale-plasma5-systemmonitor-cs \
locale-plasma5-systemmonitor-da \
locale-plasma5-systemmonitor-de \
locale-plasma5-systemmonitor-en-GB \
locale-plasma5-systemmonitor-es \
locale-plasma5-systemmonitor-eu \
locale-plasma5-systemmonitor-fi \
locale-plasma5-systemmonitor-fr \
locale-plasma5-systemmonitor-gl \
locale-plasma5-systemmonitor-hu \
locale-plasma5-systemmonitor-ia \
locale-plasma5-systemmonitor-id \
locale-plasma5-systemmonitor-it \
locale-plasma5-systemmonitor-ja \
locale-plasma5-systemmonitor-ka \
locale-plasma5-systemmonitor-ko \
locale-plasma5-systemmonitor-lt \
locale-plasma5-systemmonitor-nb \
locale-plasma5-systemmonitor-nl \
locale-plasma5-systemmonitor-nn \
locale-plasma5-systemmonitor-pa \
locale-plasma5-systemmonitor-pl \
locale-plasma5-systemmonitor-pt \
locale-plasma5-systemmonitor-pt-BR \
locale-plasma5-systemmonitor-ro \
locale-plasma5-systemmonitor-ru \
locale-plasma5-systemmonitor-sk \
locale-plasma5-systemmonitor-sl \
locale-plasma5-systemmonitor-sv \
locale-plasma5-systemmonitor-ta \
locale-plasma5-systemmonitor-tr \
locale-plasma5-systemmonitor-uk \
locale-plasma5-systemmonitor-zh-CN \
locale-plasma5-systemmonitor-zh-TW \
plasma5-systemmonitor-lang \
plasma5-systemmonitor-lang-all"

RDEPENDS:${PN} += "plasma5-systemmonitor"

inherit rpm
