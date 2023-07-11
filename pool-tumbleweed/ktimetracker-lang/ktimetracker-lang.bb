SUMMARY = "Translations for package ktimetracker"
DESCRIPTION = "Provides translations for the 'ktimetracker' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.1"

RPM_NAME = "ktimetracker-lang-5.0.1-1.19.noarch.rpm"
RPM_HASH = "6166cb7b90d86c58dad0ca523282bb1651005a0dacaadba70eb0085f0271a9535e9b1ed7dc64d45b80e1ec922e5f39b82e80edd4571e5011de22a9234a3f6ee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktimetracker-lang \
ktimetracker-lang-all \
locale-ktimetracker-af \
locale-ktimetracker-ar \
locale-ktimetracker-be \
locale-ktimetracker-bg \
locale-ktimetracker-br \
locale-ktimetracker-bs \
locale-ktimetracker-ca \
locale-ktimetracker-ca@valencia \
locale-ktimetracker-cs \
locale-ktimetracker-cy \
locale-ktimetracker-da \
locale-ktimetracker-de \
locale-ktimetracker-el \
locale-ktimetracker-en-GB \
locale-ktimetracker-eo \
locale-ktimetracker-es \
locale-ktimetracker-et \
locale-ktimetracker-eu \
locale-ktimetracker-fa \
locale-ktimetracker-fi \
locale-ktimetracker-fr \
locale-ktimetracker-ga \
locale-ktimetracker-gl \
locale-ktimetracker-he \
locale-ktimetracker-hr \
locale-ktimetracker-hu \
locale-ktimetracker-ia \
locale-ktimetracker-is \
locale-ktimetracker-it \
locale-ktimetracker-ja \
locale-ktimetracker-kk \
locale-ktimetracker-km \
locale-ktimetracker-ko \
locale-ktimetracker-lt \
locale-ktimetracker-lv \
locale-ktimetracker-mai \
locale-ktimetracker-mk \
locale-ktimetracker-mr \
locale-ktimetracker-ms \
locale-ktimetracker-nb \
locale-ktimetracker-nds \
locale-ktimetracker-ne \
locale-ktimetracker-nl \
locale-ktimetracker-nn \
locale-ktimetracker-pa \
locale-ktimetracker-pl \
locale-ktimetracker-pt \
locale-ktimetracker-pt-BR \
locale-ktimetracker-ro \
locale-ktimetracker-ru \
locale-ktimetracker-sk \
locale-ktimetracker-sl \
locale-ktimetracker-sv \
locale-ktimetracker-ta \
locale-ktimetracker-th \
locale-ktimetracker-tr \
locale-ktimetracker-ug \
locale-ktimetracker-uk \
locale-ktimetracker-zh-CN \
locale-ktimetracker-zh-TW"

RDEPENDS:${PN} += "ktimetracker"

inherit rpm
