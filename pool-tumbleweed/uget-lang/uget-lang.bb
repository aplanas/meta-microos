SUMMARY = "Translations for package uget"
DESCRIPTION = "Provides translations for the 'uget' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.3"

RPM_NAME = "uget-lang-2.2.3-3.15.noarch.rpm"
RPM_HASH = "426c761ba12fd155f4bd11a75c22366b35b074aa6b807da6c5226aaf09a96ead4678f4efa4a52cf23892d0d84245a3a7f8a9083fc74f54e5107caab1d5bbbe68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-uget-ar \
locale-uget-be \
locale-uget-bg \
locale-uget-ca \
locale-uget-cs \
locale-uget-da \
locale-uget-de \
locale-uget-es \
locale-uget-fa \
locale-uget-fr \
locale-uget-he \
locale-uget-hr \
locale-uget-hu \
locale-uget-id \
locale-uget-it \
locale-uget-ja \
locale-uget-kk \
locale-uget-lt \
locale-uget-pl \
locale-uget-pt-BR \
locale-uget-ro \
locale-uget-ru \
locale-uget-sr \
locale-uget-sr@latin \
locale-uget-sv \
locale-uget-tr \
locale-uget-uk \
locale-uget-vi \
locale-uget-zh-CN \
locale-uget-zh-TW \
uget-lang \
uget-lang-all"

RDEPENDS:${PN} += "uget"

inherit rpm
