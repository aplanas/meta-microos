SUMMARY = "Translations for package balsa"
DESCRIPTION = "Provides translations for the 'balsa' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.4"

RPM_NAME = "balsa-lang-2.6.4-2.4.noarch.rpm"
RPM_HASH = "cb6fc3afe147598a9c5e8aa0ff8a8e26c4e7eaa25ac51ac5378b4efc8b458272e4a4158c746b4ae7a859391aa9edee2eaf8e6ef3bae456a8dc5de2895849c62e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "balsa-lang \
balsa-lang-all \
locale-balsa-ar \
locale-balsa-az \
locale-balsa-bg \
locale-balsa-ca \
locale-balsa-cs \
locale-balsa-da \
locale-balsa-de \
locale-balsa-dz \
locale-balsa-el \
locale-balsa-en-CA \
locale-balsa-en-GB \
locale-balsa-es \
locale-balsa-et \
locale-balsa-eu \
locale-balsa-fi \
locale-balsa-fr \
locale-balsa-ga \
locale-balsa-gl \
locale-balsa-he \
locale-balsa-hi \
locale-balsa-hr \
locale-balsa-hu \
locale-balsa-id \
locale-balsa-it \
locale-balsa-ja \
locale-balsa-ka \
locale-balsa-ko \
locale-balsa-lt \
locale-balsa-lv \
locale-balsa-mk \
locale-balsa-ml \
locale-balsa-ms \
locale-balsa-nb \
locale-balsa-ne \
locale-balsa-nl \
locale-balsa-nn \
locale-balsa-oc \
locale-balsa-pa \
locale-balsa-pl \
locale-balsa-pt \
locale-balsa-pt-BR \
locale-balsa-ro \
locale-balsa-ru \
locale-balsa-sk \
locale-balsa-sl \
locale-balsa-sq \
locale-balsa-sr \
locale-balsa-sr@latin \
locale-balsa-sv \
locale-balsa-tr \
locale-balsa-uk \
locale-balsa-vi \
locale-balsa-wa \
locale-balsa-zh-CN \
locale-balsa-zh-HK \
locale-balsa-zh-TW"

RDEPENDS:${PN} += "balsa"

inherit rpm
