SUMMARY = "Translations for package kdialog"
DESCRIPTION = "Provides translations for the 'kdialog' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdialog-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "92f8744577edc343b0adca593fdb5606532580502e96fdaa855f85a182d9a1a97964cd7e75fa6e2d95c9c72f8b93c48145c308ed036f3b20089689e1da4612c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdialog-lang \
kdialog-lang-all \
locale-kdialog-af \
locale-kdialog-ar \
locale-kdialog-be \
locale-kdialog-be@latin \
locale-kdialog-bg \
locale-kdialog-bn \
locale-kdialog-bn-IN \
locale-kdialog-br \
locale-kdialog-bs \
locale-kdialog-ca \
locale-kdialog-ca@valencia \
locale-kdialog-cs \
locale-kdialog-cy \
locale-kdialog-da \
locale-kdialog-de \
locale-kdialog-el \
locale-kdialog-en-GB \
locale-kdialog-eo \
locale-kdialog-es \
locale-kdialog-et \
locale-kdialog-eu \
locale-kdialog-fa \
locale-kdialog-fi \
locale-kdialog-fr \
locale-kdialog-ga \
locale-kdialog-gl \
locale-kdialog-gu \
locale-kdialog-he \
locale-kdialog-hi \
locale-kdialog-hr \
locale-kdialog-hu \
locale-kdialog-ia \
locale-kdialog-id \
locale-kdialog-is \
locale-kdialog-it \
locale-kdialog-ja \
locale-kdialog-ka \
locale-kdialog-kk \
locale-kdialog-km \
locale-kdialog-kn \
locale-kdialog-ko \
locale-kdialog-lt \
locale-kdialog-lv \
locale-kdialog-mai \
locale-kdialog-mk \
locale-kdialog-ml \
locale-kdialog-mr \
locale-kdialog-ms \
locale-kdialog-nb \
locale-kdialog-nds \
locale-kdialog-ne \
locale-kdialog-nl \
locale-kdialog-nn \
locale-kdialog-oc \
locale-kdialog-or \
locale-kdialog-pa \
locale-kdialog-pl \
locale-kdialog-pt \
locale-kdialog-pt-BR \
locale-kdialog-ro \
locale-kdialog-ru \
locale-kdialog-si \
locale-kdialog-sk \
locale-kdialog-sl \
locale-kdialog-sq \
locale-kdialog-sr \
locale-kdialog-sr@ijekavian \
locale-kdialog-sr@ijekavianlatin \
locale-kdialog-sr@latin \
locale-kdialog-sv \
locale-kdialog-ta \
locale-kdialog-te \
locale-kdialog-th \
locale-kdialog-tr \
locale-kdialog-ug \
locale-kdialog-uk \
locale-kdialog-vi \
locale-kdialog-wa \
locale-kdialog-zh-CN \
locale-kdialog-zh-TW"

RDEPENDS:${PN} += "kdialog"

inherit rpm
