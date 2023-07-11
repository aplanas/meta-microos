SUMMARY = "Translations for package kopete"
DESCRIPTION = "Provides translations for the 'kopete' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kopete-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "e8744339c360d963d6e6119daa6f167893f3fa6db261fa939d3b9af3eb25a49a944fe61e70ce91e04e69a432d180d44c740dd518c6c9d2988414eaaec1221cee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kopete-lang \
kopete-lang-all \
locale-kopete-ar \
locale-kopete-be \
locale-kopete-bg \
locale-kopete-bn \
locale-kopete-br \
locale-kopete-bs \
locale-kopete-ca \
locale-kopete-ca@valencia \
locale-kopete-cs \
locale-kopete-cy \
locale-kopete-da \
locale-kopete-de \
locale-kopete-el \
locale-kopete-en-GB \
locale-kopete-eo \
locale-kopete-es \
locale-kopete-et \
locale-kopete-eu \
locale-kopete-fa \
locale-kopete-fi \
locale-kopete-fr \
locale-kopete-ga \
locale-kopete-gl \
locale-kopete-he \
locale-kopete-hi \
locale-kopete-hr \
locale-kopete-hu \
locale-kopete-ia \
locale-kopete-is \
locale-kopete-it \
locale-kopete-ja \
locale-kopete-ka \
locale-kopete-kk \
locale-kopete-km \
locale-kopete-ko \
locale-kopete-lt \
locale-kopete-lv \
locale-kopete-mai \
locale-kopete-mk \
locale-kopete-ml \
locale-kopete-mr \
locale-kopete-ms \
locale-kopete-nb \
locale-kopete-nds \
locale-kopete-ne \
locale-kopete-nl \
locale-kopete-nn \
locale-kopete-oc \
locale-kopete-pa \
locale-kopete-pl \
locale-kopete-pt \
locale-kopete-pt-BR \
locale-kopete-ro \
locale-kopete-ru \
locale-kopete-si \
locale-kopete-sk \
locale-kopete-sl \
locale-kopete-sq \
locale-kopete-sr \
locale-kopete-sr@ijekavian \
locale-kopete-sr@ijekavianlatin \
locale-kopete-sr@latin \
locale-kopete-sv \
locale-kopete-ta \
locale-kopete-th \
locale-kopete-tr \
locale-kopete-ug \
locale-kopete-uk \
locale-kopete-vi \
locale-kopete-wa \
locale-kopete-zh-CN \
locale-kopete-zh-HK \
locale-kopete-zh-TW"

RDEPENDS:${PN} += "kopete"

inherit rpm
