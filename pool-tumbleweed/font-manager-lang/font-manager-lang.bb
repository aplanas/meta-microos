SUMMARY = "Translations for package font-manager"
DESCRIPTION = "Provides translations for the 'font-manager' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.8"

RPM_NAME = "font-manager-lang-0.8.8-2.3.noarch.rpm"
RPM_HASH = "a0aabb1e21480885f1c8cbedbf53b10903cd037e273db15787ce0aff11fa442a4518356ac6796c6fdd8b41f2541df04b4ffb3aa0f7f6e5ee5d5793a76a9e44f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-manager-lang \
font-manager-lang-all \
locale-font-manager-ar \
locale-font-manager-ca \
locale-font-manager-de \
locale-font-manager-eo \
locale-font-manager-es \
locale-font-manager-fr \
locale-font-manager-hr \
locale-font-manager-id \
locale-font-manager-it \
locale-font-manager-ja \
locale-font-manager-nb-NO \
locale-font-manager-nl \
locale-font-manager-oc \
locale-font-manager-pl \
locale-font-manager-pt-BR \
locale-font-manager-ro \
locale-font-manager-ru \
locale-font-manager-si \
locale-font-manager-sl \
locale-font-manager-sv \
locale-font-manager-tr \
locale-font-manager-uk \
locale-font-manager-zh-CN \
locale-font-manager-zh-HK \
locale-font-manager-zh-TW"

RDEPENDS:${PN} += "font-manager"

inherit rpm
