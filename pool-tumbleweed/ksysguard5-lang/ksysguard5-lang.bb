SUMMARY = "Translations for package ksysguard5"
DESCRIPTION = "Provides translations for the 'ksysguard5' package."
LICENSE = "GPL-2.0-only"

PV = "5.22.0"

RPM_NAME = "ksysguard5-lang-5.22.0-3.4.noarch.rpm"
RPM_HASH = "0d6533da6595e927b93ba69b98ce0b616e7faa6a1ba453d8b31f6ac62c8fb59bb50ccbb3583ee92dd7460b09fa26d623fab9814dd02154a748249e8cc26345cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksysguard5-lang \
ksysguard5-lang-all \
locale-ksysguard5-af \
locale-ksysguard5-ar \
locale-ksysguard5-ast \
locale-ksysguard5-az \
locale-ksysguard5-be \
locale-ksysguard5-be@latin \
locale-ksysguard5-bg \
locale-ksysguard5-bn \
locale-ksysguard5-bn-IN \
locale-ksysguard5-br \
locale-ksysguard5-bs \
locale-ksysguard5-ca \
locale-ksysguard5-ca@valencia \
locale-ksysguard5-cs \
locale-ksysguard5-cy \
locale-ksysguard5-da \
locale-ksysguard5-de \
locale-ksysguard5-el \
locale-ksysguard5-en-GB \
locale-ksysguard5-eo \
locale-ksysguard5-es \
locale-ksysguard5-et \
locale-ksysguard5-eu \
locale-ksysguard5-fa \
locale-ksysguard5-fi \
locale-ksysguard5-fr \
locale-ksysguard5-ga \
locale-ksysguard5-gl \
locale-ksysguard5-gu \
locale-ksysguard5-he \
locale-ksysguard5-hi \
locale-ksysguard5-hr \
locale-ksysguard5-hu \
locale-ksysguard5-ia \
locale-ksysguard5-id \
locale-ksysguard5-is \
locale-ksysguard5-it \
locale-ksysguard5-ja \
locale-ksysguard5-kk \
locale-ksysguard5-km \
locale-ksysguard5-kn \
locale-ksysguard5-ko \
locale-ksysguard5-lt \
locale-ksysguard5-lv \
locale-ksysguard5-mai \
locale-ksysguard5-mk \
locale-ksysguard5-ml \
locale-ksysguard5-mr \
locale-ksysguard5-ms \
locale-ksysguard5-nb \
locale-ksysguard5-nds \
locale-ksysguard5-ne \
locale-ksysguard5-nl \
locale-ksysguard5-nn \
locale-ksysguard5-oc \
locale-ksysguard5-pa \
locale-ksysguard5-pl \
locale-ksysguard5-pt \
locale-ksysguard5-pt-BR \
locale-ksysguard5-ro \
locale-ksysguard5-ru \
locale-ksysguard5-si \
locale-ksysguard5-sk \
locale-ksysguard5-sl \
locale-ksysguard5-sq \
locale-ksysguard5-sr \
locale-ksysguard5-sr@ijekavian \
locale-ksysguard5-sr@ijekavianlatin \
locale-ksysguard5-sr@latin \
locale-ksysguard5-sv \
locale-ksysguard5-ta \
locale-ksysguard5-te \
locale-ksysguard5-th \
locale-ksysguard5-tr \
locale-ksysguard5-ug \
locale-ksysguard5-uk \
locale-ksysguard5-vi \
locale-ksysguard5-wa \
locale-ksysguard5-zh-CN \
locale-ksysguard5-zh-TW"

RDEPENDS:${PN} += "ksysguard5"

inherit rpm
