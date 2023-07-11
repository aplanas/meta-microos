SUMMARY = "Translations for package kapman"
DESCRIPTION = "Provides translations for the 'kapman' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kapman-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "a367b36b6d61b01253e92929fffcd7ca93f5ad35e10ec49bcc6d38f65200ffccb849de1ec0943dfe229dc6dc04ac7cfc4dcdbe602410a8b0c58ef463d6b46929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kapman-lang \
kapman-lang-all \
locale-kapman-ar \
locale-kapman-bg \
locale-kapman-bs \
locale-kapman-ca \
locale-kapman-ca@valencia \
locale-kapman-cs \
locale-kapman-da \
locale-kapman-de \
locale-kapman-el \
locale-kapman-en-GB \
locale-kapman-eo \
locale-kapman-es \
locale-kapman-et \
locale-kapman-eu \
locale-kapman-fi \
locale-kapman-fr \
locale-kapman-ga \
locale-kapman-gl \
locale-kapman-gu \
locale-kapman-hi \
locale-kapman-hr \
locale-kapman-hu \
locale-kapman-id \
locale-kapman-is \
locale-kapman-it \
locale-kapman-ja \
locale-kapman-ka \
locale-kapman-kk \
locale-kapman-km \
locale-kapman-ko \
locale-kapman-lt \
locale-kapman-lv \
locale-kapman-mai \
locale-kapman-ml \
locale-kapman-mr \
locale-kapman-ms \
locale-kapman-nb \
locale-kapman-nds \
locale-kapman-nl \
locale-kapman-nn \
locale-kapman-pl \
locale-kapman-pt \
locale-kapman-pt-BR \
locale-kapman-ro \
locale-kapman-ru \
locale-kapman-sk \
locale-kapman-sl \
locale-kapman-sq \
locale-kapman-sr \
locale-kapman-sr@ijekavian \
locale-kapman-sr@ijekavianlatin \
locale-kapman-sr@latin \
locale-kapman-sv \
locale-kapman-th \
locale-kapman-tr \
locale-kapman-ug \
locale-kapman-uk \
locale-kapman-zh-CN \
locale-kapman-zh-TW"

RDEPENDS:${PN} += "kapman"

inherit rpm
