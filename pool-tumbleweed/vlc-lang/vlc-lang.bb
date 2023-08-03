SUMMARY = "Translations for package vlc"
DESCRIPTION = "Provides translations for the 'vlc' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-lang-3.0.18-8.1.noarch.rpm"
RPM_HASH = "72862f33b994863b6b7ef7132bb5b1b3b877f02de393152f0643b367157d958db0560d85d6c9882c6161bc642cdfab40e43afc27c3847c5ab971aab5d43d6ac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vlc-af \
locale-vlc-ar \
locale-vlc-ast \
locale-vlc-be \
locale-vlc-bg \
locale-vlc-bn \
locale-vlc-bn-IN \
locale-vlc-br \
locale-vlc-bs \
locale-vlc-ca \
locale-vlc-ca@valencia \
locale-vlc-cs \
locale-vlc-cy \
locale-vlc-da \
locale-vlc-de \
locale-vlc-el \
locale-vlc-en-GB \
locale-vlc-es \
locale-vlc-es-MX \
locale-vlc-et \
locale-vlc-eu \
locale-vlc-fa \
locale-vlc-fi \
locale-vlc-fr \
locale-vlc-fur \
locale-vlc-ga \
locale-vlc-gd \
locale-vlc-gl \
locale-vlc-gu \
locale-vlc-he \
locale-vlc-hi \
locale-vlc-hr \
locale-vlc-hu \
locale-vlc-id \
locale-vlc-is \
locale-vlc-it \
locale-vlc-ja \
locale-vlc-ka \
locale-vlc-kk \
locale-vlc-km \
locale-vlc-kn \
locale-vlc-ko \
locale-vlc-lt \
locale-vlc-lv \
locale-vlc-mai \
locale-vlc-ml \
locale-vlc-mr \
locale-vlc-ms \
locale-vlc-nb \
locale-vlc-ne \
locale-vlc-nl \
locale-vlc-nn \
locale-vlc-oc \
locale-vlc-pa \
locale-vlc-pl \
locale-vlc-pt-BR \
locale-vlc-pt-PT \
locale-vlc-ro \
locale-vlc-ru \
locale-vlc-si \
locale-vlc-sk \
locale-vlc-sl \
locale-vlc-sq \
locale-vlc-sr \
locale-vlc-sv \
locale-vlc-ta \
locale-vlc-te \
locale-vlc-th \
locale-vlc-tr \
locale-vlc-ug \
locale-vlc-uk \
locale-vlc-vi \
locale-vlc-wa \
locale-vlc-zh-CN \
locale-vlc-zh-TW \
vlc-lang \
vlc-lang-all"

RDEPENDS:${PN} += "vlc-noX"

inherit rpm
