SUMMARY = "Translations for package realmd"
DESCRIPTION = "Provides translations for the 'realmd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.1"

RPM_NAME = "realmd-lang-0.17.1-2.1.noarch.rpm"
RPM_HASH = "32e09d48f936c7da1b62a4762643e2ff2954b5e19751ffdbd98e94e8349b4685905eb95ef2b64826a6469840c6f717681a7d65bf60a868cfb4c928eefbdb7629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-realmd-ar \
locale-realmd-as \
locale-realmd-az \
locale-realmd-bg \
locale-realmd-bn-IN \
locale-realmd-ca \
locale-realmd-ca@valencia \
locale-realmd-cs \
locale-realmd-cy \
locale-realmd-da \
locale-realmd-de \
locale-realmd-el \
locale-realmd-en-GB \
locale-realmd-eo \
locale-realmd-es \
locale-realmd-et \
locale-realmd-eu \
locale-realmd-fa \
locale-realmd-fi \
locale-realmd-fr \
locale-realmd-ga \
locale-realmd-gl \
locale-realmd-gu \
locale-realmd-he \
locale-realmd-hi \
locale-realmd-hr \
locale-realmd-hu \
locale-realmd-ia \
locale-realmd-id \
locale-realmd-it \
locale-realmd-ja \
locale-realmd-ka \
locale-realmd-kk \
locale-realmd-kn \
locale-realmd-ko \
locale-realmd-lt \
locale-realmd-lv \
locale-realmd-ml \
locale-realmd-mr \
locale-realmd-ms \
locale-realmd-nb \
locale-realmd-nl \
locale-realmd-nn \
locale-realmd-oc \
locale-realmd-or \
locale-realmd-pa \
locale-realmd-pl \
locale-realmd-pt \
locale-realmd-pt-BR \
locale-realmd-ro \
locale-realmd-ru \
locale-realmd-si \
locale-realmd-sk \
locale-realmd-sl \
locale-realmd-sq \
locale-realmd-sr@latin \
locale-realmd-sv \
locale-realmd-ta \
locale-realmd-te \
locale-realmd-th \
locale-realmd-tr \
locale-realmd-uk \
locale-realmd-vi \
locale-realmd-wa \
locale-realmd-zh-CN \
locale-realmd-zh-HK \
locale-realmd-zh-TW \
realmd-lang \
realmd-lang-all"

RDEPENDS:${PN} += "realmd"

inherit rpm
