SUMMARY = "Translations for package kdevelop5"
DESCRIPTION = "Provides translations for the 'kdevelop' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdevelop5-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "2886c37d9ff39d856ffaf65f599e94763af053cd3b5a2719b02cdb9c0f67330c689deb08070dd091906769be0b29667425fb8e984aba1ef45628475d4f567c66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdevelop5-lang \
kdevelop5-lang-all \
kdevelop5-plugin-clang-tidy-lang \
locale-kdevelop5-af \
locale-kdevelop5-ar \
locale-kdevelop5-az \
locale-kdevelop5-be \
locale-kdevelop5-bg \
locale-kdevelop5-br \
locale-kdevelop5-bs \
locale-kdevelop5-ca \
locale-kdevelop5-ca@valencia \
locale-kdevelop5-cs \
locale-kdevelop5-cy \
locale-kdevelop5-da \
locale-kdevelop5-de \
locale-kdevelop5-el \
locale-kdevelop5-en-GB \
locale-kdevelop5-eo \
locale-kdevelop5-es \
locale-kdevelop5-et \
locale-kdevelop5-eu \
locale-kdevelop5-fa \
locale-kdevelop5-fi \
locale-kdevelop5-fr \
locale-kdevelop5-ga \
locale-kdevelop5-gl \
locale-kdevelop5-hi \
locale-kdevelop5-hr \
locale-kdevelop5-hu \
locale-kdevelop5-is \
locale-kdevelop5-it \
locale-kdevelop5-ja \
locale-kdevelop5-ka \
locale-kdevelop5-kk \
locale-kdevelop5-km \
locale-kdevelop5-ko \
locale-kdevelop5-lt \
locale-kdevelop5-lv \
locale-kdevelop5-mai \
locale-kdevelop5-mr \
locale-kdevelop5-ms \
locale-kdevelop5-nb \
locale-kdevelop5-nds \
locale-kdevelop5-ne \
locale-kdevelop5-nl \
locale-kdevelop5-nn \
locale-kdevelop5-oc \
locale-kdevelop5-pa \
locale-kdevelop5-pl \
locale-kdevelop5-pt \
locale-kdevelop5-pt-BR \
locale-kdevelop5-ro \
locale-kdevelop5-ru \
locale-kdevelop5-sk \
locale-kdevelop5-sl \
locale-kdevelop5-sv \
locale-kdevelop5-ta \
locale-kdevelop5-th \
locale-kdevelop5-tr \
locale-kdevelop5-ug \
locale-kdevelop5-uk \
locale-kdevelop5-vi \
locale-kdevelop5-zh-CN \
locale-kdevelop5-zh-TW"

RDEPENDS:${PN} += "kdevelop5"

inherit rpm
