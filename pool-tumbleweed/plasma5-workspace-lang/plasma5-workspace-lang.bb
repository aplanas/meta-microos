SUMMARY = "Translations for package plasma5-workspace"
DESCRIPTION = "Provides translations for the 'plasma5-workspace' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-workspace-lang-5.27.7-3.1.noarch.rpm"
RPM_HASH = "49b367e2fc9bf1c0f31af29845b93dd89eccbc3d0629193299b7ec94ed1ef6c0857cceb86d25be302f7bcd7567a93e8d5caf7f6ef38e82622f9f42a934afbbda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma5-workspace-af \
locale-plasma5-workspace-ar \
locale-plasma5-workspace-az \
locale-plasma5-workspace-be \
locale-plasma5-workspace-be@latin \
locale-plasma5-workspace-bg \
locale-plasma5-workspace-bn \
locale-plasma5-workspace-bn-IN \
locale-plasma5-workspace-br \
locale-plasma5-workspace-bs \
locale-plasma5-workspace-ca \
locale-plasma5-workspace-ca@valencia \
locale-plasma5-workspace-cs \
locale-plasma5-workspace-cy \
locale-plasma5-workspace-da \
locale-plasma5-workspace-de \
locale-plasma5-workspace-el \
locale-plasma5-workspace-en-GB \
locale-plasma5-workspace-eo \
locale-plasma5-workspace-es \
locale-plasma5-workspace-et \
locale-plasma5-workspace-eu \
locale-plasma5-workspace-fa \
locale-plasma5-workspace-fi \
locale-plasma5-workspace-fr \
locale-plasma5-workspace-ga \
locale-plasma5-workspace-gl \
locale-plasma5-workspace-gu \
locale-plasma5-workspace-he \
locale-plasma5-workspace-hi \
locale-plasma5-workspace-hr \
locale-plasma5-workspace-hu \
locale-plasma5-workspace-ia \
locale-plasma5-workspace-id \
locale-plasma5-workspace-is \
locale-plasma5-workspace-it \
locale-plasma5-workspace-ja \
locale-plasma5-workspace-ka \
locale-plasma5-workspace-kk \
locale-plasma5-workspace-km \
locale-plasma5-workspace-kn \
locale-plasma5-workspace-ko \
locale-plasma5-workspace-lt \
locale-plasma5-workspace-lv \
locale-plasma5-workspace-mai \
locale-plasma5-workspace-mk \
locale-plasma5-workspace-ml \
locale-plasma5-workspace-mr \
locale-plasma5-workspace-ms \
locale-plasma5-workspace-nb \
locale-plasma5-workspace-nds \
locale-plasma5-workspace-ne \
locale-plasma5-workspace-nl \
locale-plasma5-workspace-nn \
locale-plasma5-workspace-oc \
locale-plasma5-workspace-or \
locale-plasma5-workspace-pa \
locale-plasma5-workspace-pl \
locale-plasma5-workspace-pt \
locale-plasma5-workspace-pt-BR \
locale-plasma5-workspace-ro \
locale-plasma5-workspace-ru \
locale-plasma5-workspace-si \
locale-plasma5-workspace-sk \
locale-plasma5-workspace-sl \
locale-plasma5-workspace-sq \
locale-plasma5-workspace-sr \
locale-plasma5-workspace-sr@ijekavian \
locale-plasma5-workspace-sr@ijekavianlatin \
locale-plasma5-workspace-sr@latin \
locale-plasma5-workspace-sv \
locale-plasma5-workspace-ta \
locale-plasma5-workspace-te \
locale-plasma5-workspace-th \
locale-plasma5-workspace-tr \
locale-plasma5-workspace-ug \
locale-plasma5-workspace-uk \
locale-plasma5-workspace-vi \
locale-plasma5-workspace-wa \
locale-plasma5-workspace-zh-CN \
locale-plasma5-workspace-zh-TW \
plasma5-workspace-lang \
plasma5-workspace-lang-all"

RDEPENDS:${PN} += "plasma5-workspace"

inherit rpm
