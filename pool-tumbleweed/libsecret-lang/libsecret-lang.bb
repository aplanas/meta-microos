SUMMARY = "Translations for package libsecret"
DESCRIPTION = "Provides translations for the 'libsecret' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "libsecret-lang-0.20.5-1.8.noarch.rpm"
RPM_HASH = "d5f7be4595306912f7aebb3b90a1aee8ba13d4c286e2c477c971425f67f2876a08ca7c17784240bafd119542bee2e4455ce7702df7f3ab18f0e8b7ca6d4f51e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsecret-lang \
libsecret-lang-all \
locale-libsecret-ar \
locale-libsecret-as \
locale-libsecret-be \
locale-libsecret-bg \
locale-libsecret-bs \
locale-libsecret-ca \
locale-libsecret-ca@valencia \
locale-libsecret-cs \
locale-libsecret-da \
locale-libsecret-de \
locale-libsecret-el \
locale-libsecret-en-GB \
locale-libsecret-eo \
locale-libsecret-es \
locale-libsecret-eu \
locale-libsecret-fa \
locale-libsecret-fi \
locale-libsecret-fr \
locale-libsecret-fur \
locale-libsecret-gl \
locale-libsecret-he \
locale-libsecret-hr \
locale-libsecret-hu \
locale-libsecret-id \
locale-libsecret-it \
locale-libsecret-ja \
locale-libsecret-kk \
locale-libsecret-ko \
locale-libsecret-lt \
locale-libsecret-lv \
locale-libsecret-ml \
locale-libsecret-ms \
locale-libsecret-nb \
locale-libsecret-ne \
locale-libsecret-nl \
locale-libsecret-oc \
locale-libsecret-pa \
locale-libsecret-pl \
locale-libsecret-pt \
locale-libsecret-pt-BR \
locale-libsecret-ro \
locale-libsecret-ru \
locale-libsecret-sk \
locale-libsecret-sl \
locale-libsecret-sr \
locale-libsecret-sr@latin \
locale-libsecret-sv \
locale-libsecret-tr \
locale-libsecret-uk \
locale-libsecret-vi \
locale-libsecret-zh-CN \
locale-libsecret-zh-HK \
locale-libsecret-zh-TW"

RDEPENDS:${PN} += "libsecret"

inherit rpm
