SUMMARY = "Translations for package blueman"
DESCRIPTION = "Provides translations for the 'blueman' package."
LICENSE = "GPL-3.0-only"

PV = "2.3.5"

RPM_NAME = "blueman-lang-2.3.5-1.3.noarch.rpm"
RPM_HASH = "faab5afe1b7e91f1f4d16169ee52c85681dd33093e6492b659fa929f9bce8c5b7a64dd47d992f859bd73274f79d7b0ef9e88b5c08721fe61f84bc97d21ef3319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blueman-lang \
blueman-lang-all \
locale-blueman-af \
locale-blueman-ar \
locale-blueman-ast \
locale-blueman-be \
locale-blueman-bg \
locale-blueman-bs \
locale-blueman-ca \
locale-blueman-cs \
locale-blueman-cy \
locale-blueman-da \
locale-blueman-de \
locale-blueman-el \
locale-blueman-en-AU \
locale-blueman-en-GB \
locale-blueman-es \
locale-blueman-et \
locale-blueman-eu \
locale-blueman-fa \
locale-blueman-fi \
locale-blueman-fr \
locale-blueman-gl \
locale-blueman-he \
locale-blueman-hi \
locale-blueman-hr \
locale-blueman-hu \
locale-blueman-id \
locale-blueman-it \
locale-blueman-ja \
locale-blueman-kk \
locale-blueman-ko \
locale-blueman-lt \
locale-blueman-lv \
locale-blueman-mk \
locale-blueman-mr \
locale-blueman-ms \
locale-blueman-nb \
locale-blueman-nds \
locale-blueman-nl \
locale-blueman-oc \
locale-blueman-pl \
locale-blueman-pt \
locale-blueman-pt-BR \
locale-blueman-ro \
locale-blueman-ru \
locale-blueman-sk \
locale-blueman-sl \
locale-blueman-sq \
locale-blueman-sr \
locale-blueman-sv \
locale-blueman-ta \
locale-blueman-tr \
locale-blueman-uk \
locale-blueman-vi \
locale-blueman-zh-CN \
locale-blueman-zh-HK \
locale-blueman-zh-TW"

RDEPENDS:${PN} += "blueman"

inherit rpm
