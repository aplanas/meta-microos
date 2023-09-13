SUMMARY = "Translations for package timeshift"
DESCRIPTION = "Provides translations for the 'timeshift' package."
LICENSE = "GPL-3.0-only"

PV = "23.07.1"

RPM_NAME = "timeshift-lang-23.07.1-1.1.noarch.rpm"
RPM_HASH = "fa44b6da4724fe2707b4243f4e5c88bbe5ebb021cc1b118e555fa330dc527796ba3ada94cf9a694be68d784c62ba7da80e34ef2be6df68bc3027f5bf0301bad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-timeshift-ar \
locale-timeshift-az \
locale-timeshift-bg \
locale-timeshift-ca \
locale-timeshift-cs \
locale-timeshift-da \
locale-timeshift-de \
locale-timeshift-el \
locale-timeshift-en-GB \
locale-timeshift-es \
locale-timeshift-et \
locale-timeshift-eu \
locale-timeshift-fi \
locale-timeshift-fr \
locale-timeshift-fr-CA \
locale-timeshift-he \
locale-timeshift-hi \
locale-timeshift-hr \
locale-timeshift-hu \
locale-timeshift-ia \
locale-timeshift-id \
locale-timeshift-is \
locale-timeshift-it \
locale-timeshift-ja \
locale-timeshift-ka \
locale-timeshift-ko \
locale-timeshift-lt \
locale-timeshift-nb \
locale-timeshift-ne \
locale-timeshift-nl \
locale-timeshift-pl \
locale-timeshift-pt \
locale-timeshift-pt-BR \
locale-timeshift-ro \
locale-timeshift-ru \
locale-timeshift-sk \
locale-timeshift-sr \
locale-timeshift-sv \
locale-timeshift-tr \
locale-timeshift-uk \
locale-timeshift-vi \
locale-timeshift-zh-CN \
locale-timeshift-zh-TW \
timeshift-lang \
timeshift-lang-all"

RDEPENDS:${PN} += "timeshift"

inherit rpm
