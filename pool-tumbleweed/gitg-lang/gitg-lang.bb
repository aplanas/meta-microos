SUMMARY = "Translations for package gitg"
DESCRIPTION = "Provides translations for the 'gitg' package."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "gitg-lang-41-2.10.noarch.rpm"
RPM_HASH = "5058343e36796f7c43fd732e34de768e42aba52ed86c70b427b94832fe112858e60b7eff3cb4a89b0f54c8954e780f8413499ea185a3c9c7c36b9ab25890f232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitg-lang \
gitg-lang-all \
locale-gitg-as \
locale-gitg-bg \
locale-gitg-bs \
locale-gitg-ca \
locale-gitg-ca@valencia \
locale-gitg-cs \
locale-gitg-da \
locale-gitg-de \
locale-gitg-el \
locale-gitg-en-GB \
locale-gitg-eo \
locale-gitg-es \
locale-gitg-eu \
locale-gitg-fi \
locale-gitg-fr \
locale-gitg-fur \
locale-gitg-gl \
locale-gitg-he \
locale-gitg-hu \
locale-gitg-id \
locale-gitg-it \
locale-gitg-ja \
locale-gitg-kk \
locale-gitg-ko \
locale-gitg-lt \
locale-gitg-lv \
locale-gitg-ml \
locale-gitg-ms \
locale-gitg-nb \
locale-gitg-ne \
locale-gitg-nl \
locale-gitg-oc \
locale-gitg-pa \
locale-gitg-pl \
locale-gitg-pt \
locale-gitg-pt-BR \
locale-gitg-ro \
locale-gitg-ru \
locale-gitg-sk \
locale-gitg-sl \
locale-gitg-sr \
locale-gitg-sr@latin \
locale-gitg-sv \
locale-gitg-tr \
locale-gitg-uk \
locale-gitg-vi \
locale-gitg-zh-CN \
locale-gitg-zh-HK \
locale-gitg-zh-TW"

RDEPENDS:${PN} += "gitg"

inherit rpm
