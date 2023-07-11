SUMMARY = "Translations for package libpurple"
DESCRIPTION = "Provides translations for the 'libpurple' package."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple-lang-2.14.12-1.4.noarch.rpm"
RPM_HASH = "ad13cb4e737a983f380bd8dcd450c7d6f88d782d3d10e328d1f07cfe3b136a9450cd4c64f18416e17ea4275446cc757fa8f79dd3f5efadae465294a456d538f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpurple-lang \
libpurple-lang-all \
locale-libpurple-af \
locale-libpurple-ar \
locale-libpurple-as \
locale-libpurple-ast \
locale-libpurple-az \
locale-libpurple-be@latin \
locale-libpurple-bg \
locale-libpurple-bn \
locale-libpurple-bn-IN \
locale-libpurple-br \
locale-libpurple-bs \
locale-libpurple-ca \
locale-libpurple-ca@valencia \
locale-libpurple-cs \
locale-libpurple-da \
locale-libpurple-de \
locale-libpurple-dz \
locale-libpurple-el \
locale-libpurple-en-AU \
locale-libpurple-en-CA \
locale-libpurple-en-GB \
locale-libpurple-eo \
locale-libpurple-es \
locale-libpurple-es-AR \
locale-libpurple-et \
locale-libpurple-eu \
locale-libpurple-fa \
locale-libpurple-fi \
locale-libpurple-fr \
locale-libpurple-ga \
locale-libpurple-gl \
locale-libpurple-gu \
locale-libpurple-he \
locale-libpurple-hi \
locale-libpurple-hr \
locale-libpurple-hu \
locale-libpurple-id \
locale-libpurple-it \
locale-libpurple-ja \
locale-libpurple-ka \
locale-libpurple-kk \
locale-libpurple-km \
locale-libpurple-kn \
locale-libpurple-ko \
locale-libpurple-lt \
locale-libpurple-lv \
locale-libpurple-mai \
locale-libpurple-mk \
locale-libpurple-ml \
locale-libpurple-mr \
locale-libpurple-nb \
locale-libpurple-ne \
locale-libpurple-nl \
locale-libpurple-nn \
locale-libpurple-oc \
locale-libpurple-or \
locale-libpurple-pa \
locale-libpurple-pl \
locale-libpurple-pt \
locale-libpurple-pt-BR \
locale-libpurple-ro \
locale-libpurple-ru \
locale-libpurple-si \
locale-libpurple-sk \
locale-libpurple-sl \
locale-libpurple-sq \
locale-libpurple-sr \
locale-libpurple-sr@latin \
locale-libpurple-sv \
locale-libpurple-ta \
locale-libpurple-te \
locale-libpurple-th \
locale-libpurple-tr \
locale-libpurple-uk \
locale-libpurple-vi \
locale-libpurple-zh-CN \
locale-libpurple-zh-HK \
locale-libpurple-zh-TW"

RDEPENDS:${PN} += "libpurple"

inherit rpm
