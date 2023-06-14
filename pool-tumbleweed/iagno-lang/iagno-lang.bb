SUMMARY = "Translations for package iagno"
DESCRIPTION = "Provides translations for the 'iagno' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.1"

RPM_NAME = "iagno-lang-3.38.1-2.12.noarch.rpm"
RPM_HASH = "3b140a37a7d5c922b96ed85bcbdfc53729cf19c8ddf7439fbe9a8cff9f3a4d41ea2b4cb174dca3fdeb1f69844b524a021e4eccb9bc78a04b7a5ae1ac7cff85c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iagno-lang \
iagno-lang-all \
locale-iagno-af \
locale-iagno-ar \
locale-iagno-as \
locale-iagno-ast \
locale-iagno-az \
locale-iagno-be \
locale-iagno-bg \
locale-iagno-bn \
locale-iagno-bn-IN \
locale-iagno-br \
locale-iagno-bs \
locale-iagno-ca \
locale-iagno-ca@valencia \
locale-iagno-cs \
locale-iagno-cy \
locale-iagno-da \
locale-iagno-de \
locale-iagno-dz \
locale-iagno-el \
locale-iagno-en-CA \
locale-iagno-en-GB \
locale-iagno-en@shaw \
locale-iagno-eo \
locale-iagno-es \
locale-iagno-et \
locale-iagno-eu \
locale-iagno-fa \
locale-iagno-fi \
locale-iagno-fr \
locale-iagno-fur \
locale-iagno-ga \
locale-iagno-gl \
locale-iagno-gu \
locale-iagno-he \
locale-iagno-hi \
locale-iagno-hr \
locale-iagno-hu \
locale-iagno-id \
locale-iagno-is \
locale-iagno-it \
locale-iagno-ja \
locale-iagno-ka \
locale-iagno-kk \
locale-iagno-km \
locale-iagno-kn \
locale-iagno-ko \
locale-iagno-lt \
locale-iagno-lv \
locale-iagno-mai \
locale-iagno-mk \
locale-iagno-ml \
locale-iagno-mr \
locale-iagno-ms \
locale-iagno-nb \
locale-iagno-ne \
locale-iagno-nl \
locale-iagno-nn \
locale-iagno-oc \
locale-iagno-or \
locale-iagno-pa \
locale-iagno-pl \
locale-iagno-pt \
locale-iagno-pt-BR \
locale-iagno-ro \
locale-iagno-ru \
locale-iagno-si \
locale-iagno-sk \
locale-iagno-sl \
locale-iagno-sq \
locale-iagno-sr \
locale-iagno-sr@latin \
locale-iagno-sv \
locale-iagno-ta \
locale-iagno-te \
locale-iagno-th \
locale-iagno-tr \
locale-iagno-ug \
locale-iagno-uk \
locale-iagno-vi \
locale-iagno-wa \
locale-iagno-zh-CN \
locale-iagno-zh-HK \
locale-iagno-zh-TW"

RDEPENDS:${PN} += "iagno"

inherit rpm
