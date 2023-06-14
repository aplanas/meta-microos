SUMMARY = "Translations for package glade"
DESCRIPTION = "Provides translations for the 'glade' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "glade-lang-3.40.0-2.3.noarch.rpm"
RPM_HASH = "6fde8665ab41312165a322a36c88ede9aca21262ec4cd7130bb940513b2f70e76e94cf6a1fd6c4f1df059445b4a7bda29e84a4ba6b78680f085c1189d24b43e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glade-lang \
glade-lang-all \
locale-glade-ar \
locale-glade-ast \
locale-glade-az \
locale-glade-bg \
locale-glade-bn \
locale-glade-bn-IN \
locale-glade-bs \
locale-glade-ca \
locale-glade-ca@valencia \
locale-glade-cs \
locale-glade-da \
locale-glade-de \
locale-glade-el \
locale-glade-en-CA \
locale-glade-en-GB \
locale-glade-en@shaw \
locale-glade-eo \
locale-glade-es \
locale-glade-et \
locale-glade-eu \
locale-glade-fi \
locale-glade-fr \
locale-glade-fur \
locale-glade-gl \
locale-glade-gu \
locale-glade-he \
locale-glade-hi \
locale-glade-hu \
locale-glade-id \
locale-glade-it \
locale-glade-ja \
locale-glade-ka \
locale-glade-kk \
locale-glade-km \
locale-glade-ko \
locale-glade-lt \
locale-glade-lv \
locale-glade-mai \
locale-glade-mk \
locale-glade-ml \
locale-glade-mr \
locale-glade-ms \
locale-glade-nb \
locale-glade-ne \
locale-glade-nl \
locale-glade-nn \
locale-glade-oc \
locale-glade-or \
locale-glade-pa \
locale-glade-pl \
locale-glade-pt \
locale-glade-pt-BR \
locale-glade-ro \
locale-glade-ru \
locale-glade-si \
locale-glade-sk \
locale-glade-sl \
locale-glade-sq \
locale-glade-sr \
locale-glade-sr@latin \
locale-glade-sv \
locale-glade-ta \
locale-glade-te \
locale-glade-th \
locale-glade-tr \
locale-glade-ug \
locale-glade-uk \
locale-glade-vi \
locale-glade-zh-CN \
locale-glade-zh-HK \
locale-glade-zh-TW"

RDEPENDS:${PN} += "glade"

inherit rpm
