SUMMARY = "Translations for package rednotebook"
DESCRIPTION = "Provides translations for the 'rednotebook' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.29.6"

RPM_NAME = "rednotebook-lang-2.29.6-1.1.noarch.rpm"
RPM_HASH = "fd0e384f9c388c35320e64be5abeddb8ebf88be9a4b99c5457292ffe1a86726183eba234382a997ba0a0da889a35aa0a18ddf6e5b6cf55b3634289a78ab11fb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rednotebook-ar \
locale-rednotebook-ast \
locale-rednotebook-be \
locale-rednotebook-bg \
locale-rednotebook-bs \
locale-rednotebook-ca \
locale-rednotebook-cs \
locale-rednotebook-cy \
locale-rednotebook-da \
locale-rednotebook-de \
locale-rednotebook-el \
locale-rednotebook-en-GB \
locale-rednotebook-eo \
locale-rednotebook-es \
locale-rednotebook-eu \
locale-rednotebook-fi \
locale-rednotebook-fr \
locale-rednotebook-ga \
locale-rednotebook-gl \
locale-rednotebook-he \
locale-rednotebook-hi \
locale-rednotebook-hr \
locale-rednotebook-hu \
locale-rednotebook-id \
locale-rednotebook-it \
locale-rednotebook-ja \
locale-rednotebook-ka \
locale-rednotebook-kk \
locale-rednotebook-ko \
locale-rednotebook-lt \
locale-rednotebook-ml \
locale-rednotebook-ms \
locale-rednotebook-nb \
locale-rednotebook-nds \
locale-rednotebook-nl \
locale-rednotebook-nn \
locale-rednotebook-oc \
locale-rednotebook-pl \
locale-rednotebook-pt \
locale-rednotebook-pt-BR \
locale-rednotebook-ro \
locale-rednotebook-ru \
locale-rednotebook-si \
locale-rednotebook-sk \
locale-rednotebook-sl \
locale-rednotebook-sr \
locale-rednotebook-sv \
locale-rednotebook-ta \
locale-rednotebook-te \
locale-rednotebook-tr \
locale-rednotebook-ug \
locale-rednotebook-uk \
locale-rednotebook-vi \
locale-rednotebook-zh-CN \
locale-rednotebook-zh-HK \
locale-rednotebook-zh-TW \
rednotebook-lang \
rednotebook-lang-all"

RDEPENDS:${PN} += "rednotebook"

inherit rpm
