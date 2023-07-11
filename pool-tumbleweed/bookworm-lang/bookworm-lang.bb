SUMMARY = "Translations for package bookworm"
DESCRIPTION = "Provides translations for the 'bookworm' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "bookworm-lang-1.1.2-2.11.noarch.rpm"
RPM_HASH = "435f1c5cf9e07395cb5d368037d84d905d62fb931e1c568a260f9c0d76e7c33552a59340776efd863eb7efbb7556832f6009cdf40472cdc895127884947a67e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bookworm-lang \
bookworm-lang-all \
locale-bookworm-af \
locale-bookworm-ar \
locale-bookworm-as \
locale-bookworm-ast \
locale-bookworm-az \
locale-bookworm-be \
locale-bookworm-bg \
locale-bookworm-bn \
locale-bookworm-br \
locale-bookworm-bs \
locale-bookworm-ca \
locale-bookworm-cs \
locale-bookworm-cy \
locale-bookworm-da \
locale-bookworm-de \
locale-bookworm-dz \
locale-bookworm-el \
locale-bookworm-en-AU \
locale-bookworm-en-CA \
locale-bookworm-en-GB \
locale-bookworm-eo \
locale-bookworm-es \
locale-bookworm-es-MX \
locale-bookworm-et \
locale-bookworm-eu \
locale-bookworm-fa \
locale-bookworm-fi \
locale-bookworm-fr \
locale-bookworm-fr-CA \
locale-bookworm-ga \
locale-bookworm-gd \
locale-bookworm-gl \
locale-bookworm-gu \
locale-bookworm-he \
locale-bookworm-hi \
locale-bookworm-hr \
locale-bookworm-hu \
locale-bookworm-ia \
locale-bookworm-id \
locale-bookworm-is \
locale-bookworm-it \
locale-bookworm-ja \
locale-bookworm-ka \
locale-bookworm-kk \
locale-bookworm-km \
locale-bookworm-kn \
locale-bookworm-ko \
locale-bookworm-lt \
locale-bookworm-lv \
locale-bookworm-mk \
locale-bookworm-ml \
locale-bookworm-mr \
locale-bookworm-ms \
locale-bookworm-nb-NO \
locale-bookworm-ne \
locale-bookworm-nl \
locale-bookworm-nn \
locale-bookworm-oc \
locale-bookworm-or \
locale-bookworm-pa \
locale-bookworm-pl \
locale-bookworm-pt \
locale-bookworm-pt-BR \
locale-bookworm-ro \
locale-bookworm-ru \
locale-bookworm-si \
locale-bookworm-sk \
locale-bookworm-sl \
locale-bookworm-sq \
locale-bookworm-sr \
locale-bookworm-sv \
locale-bookworm-ta \
locale-bookworm-te \
locale-bookworm-th \
locale-bookworm-tr \
locale-bookworm-ug \
locale-bookworm-uk \
locale-bookworm-vi \
locale-bookworm-wa \
locale-bookworm-zh \
locale-bookworm-zh-CN \
locale-bookworm-zh-HK \
locale-bookworm-zh-TW"

RDEPENDS:${PN} += "bookworm"

inherit rpm
