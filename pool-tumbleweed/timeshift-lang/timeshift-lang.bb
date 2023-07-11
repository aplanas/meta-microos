SUMMARY = "Translations for package timeshift"
DESCRIPTION = "Provides translations for the 'timeshift' package."
LICENSE = "GPL-3.0-only"

PV = "22.11.2"

RPM_NAME = "timeshift-lang-22.11.2-1.4.noarch.rpm"
RPM_HASH = "2962fda17abbf7ee60a4b2d0d58f0f94ca1ed03188b2fc8eecc084e857e7c7befdd4e8057a648d377629d1c9ac73917a297391dc9a12e09879cbff0a5032221e"
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
locale-timeshift-he \
locale-timeshift-hi \
locale-timeshift-hr \
locale-timeshift-hu \
locale-timeshift-ia \
locale-timeshift-id \
locale-timeshift-is \
locale-timeshift-it \
locale-timeshift-ja \
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
