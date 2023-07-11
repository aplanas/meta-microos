SUMMARY = "Translations for package neomutt"
DESCRIPTION = "Provides translations for the 'neomutt' package."
LICENSE = "GPL-2.0-or-later"

PV = "20230517"

RPM_NAME = "neomutt-lang-20230517-1.2.noarch.rpm"
RPM_HASH = "061e34e3093eabdfc0639bd884923343812670c745e64ab3c133c1e1da1c9b8eed387f998233f91a3723ace66123be73d8343cb98a409d2405823132e289bacc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-neomutt-bg \
locale-neomutt-ca \
locale-neomutt-cs \
locale-neomutt-da \
locale-neomutt-de \
locale-neomutt-el \
locale-neomutt-en-GB \
locale-neomutt-eo \
locale-neomutt-es \
locale-neomutt-et \
locale-neomutt-eu \
locale-neomutt-fi \
locale-neomutt-fr \
locale-neomutt-ga \
locale-neomutt-gl \
locale-neomutt-hu \
locale-neomutt-id \
locale-neomutt-it \
locale-neomutt-ja \
locale-neomutt-ko \
locale-neomutt-lt \
locale-neomutt-nb-NO \
locale-neomutt-nl \
locale-neomutt-pl \
locale-neomutt-pt-BR \
locale-neomutt-ru \
locale-neomutt-sk \
locale-neomutt-sr \
locale-neomutt-sv \
locale-neomutt-tr \
locale-neomutt-uk \
locale-neomutt-zh-CN \
locale-neomutt-zh-TW \
neomutt-lang \
neomutt-lang-all"

RDEPENDS:${PN} += "neomutt"

inherit rpm
