SUMMARY = "Translations for package grilo-plugins"
DESCRIPTION = "Provides translations for the 'grilo-plugins' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-plugins-lang-0.3.16-1.2.noarch.rpm"
RPM_HASH = "4b8dd6413e6ace7f74aa5d0a987a5f86db26e489832f0f1536ba1e0412359b20e61534bb81a1fb90079c028694a2e9351e3ad05c72782339623ab75c7cd6c243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grilo-plugins-lang \
grilo-plugins-lang-all \
locale-grilo-plugins-as \
locale-grilo-plugins-be \
locale-grilo-plugins-bg \
locale-grilo-plugins-bs \
locale-grilo-plugins-ca \
locale-grilo-plugins-ca@valencia \
locale-grilo-plugins-cs \
locale-grilo-plugins-da \
locale-grilo-plugins-de \
locale-grilo-plugins-el \
locale-grilo-plugins-en-GB \
locale-grilo-plugins-eo \
locale-grilo-plugins-es \
locale-grilo-plugins-eu \
locale-grilo-plugins-fi \
locale-grilo-plugins-fr \
locale-grilo-plugins-fur \
locale-grilo-plugins-gl \
locale-grilo-plugins-he \
locale-grilo-plugins-hr \
locale-grilo-plugins-hu \
locale-grilo-plugins-id \
locale-grilo-plugins-it \
locale-grilo-plugins-ja \
locale-grilo-plugins-ka \
locale-grilo-plugins-ko \
locale-grilo-plugins-lt \
locale-grilo-plugins-lv \
locale-grilo-plugins-ml \
locale-grilo-plugins-ms \
locale-grilo-plugins-nb \
locale-grilo-plugins-ne \
locale-grilo-plugins-nl \
locale-grilo-plugins-oc \
locale-grilo-plugins-pa \
locale-grilo-plugins-pl \
locale-grilo-plugins-pt \
locale-grilo-plugins-pt-BR \
locale-grilo-plugins-ro \
locale-grilo-plugins-ru \
locale-grilo-plugins-sk \
locale-grilo-plugins-sl \
locale-grilo-plugins-sr \
locale-grilo-plugins-sr@latin \
locale-grilo-plugins-sv \
locale-grilo-plugins-tr \
locale-grilo-plugins-uk \
locale-grilo-plugins-zh-CN \
locale-grilo-plugins-zh-HK \
locale-grilo-plugins-zh-TW"

RDEPENDS:${PN} += "grilo-plugins"

inherit rpm
