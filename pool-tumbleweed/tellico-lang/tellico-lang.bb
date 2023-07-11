SUMMARY = "Translations for package tellico"
DESCRIPTION = "Provides translations for the 'tellico' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "tellico-lang-3.5.1-1.1.noarch.rpm"
RPM_HASH = "8d63a87c7725c73f3298fe53415d0c46567f1024a36dcb0d2287b21b871ac63bc8b60e40b9f26548b30aff50bebde2fc4d141d1762a043292e3830e3ae87486f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tellico-bg \
locale-tellico-bs \
locale-tellico-ca \
locale-tellico-ca@valencia \
locale-tellico-cs \
locale-tellico-da \
locale-tellico-de \
locale-tellico-el \
locale-tellico-en-GB \
locale-tellico-eo \
locale-tellico-es \
locale-tellico-et \
locale-tellico-eu \
locale-tellico-fi \
locale-tellico-fr \
locale-tellico-ga \
locale-tellico-gl \
locale-tellico-hu \
locale-tellico-ia \
locale-tellico-it \
locale-tellico-ka \
locale-tellico-kk \
locale-tellico-ko \
locale-tellico-lt \
locale-tellico-mr \
locale-tellico-ms \
locale-tellico-nb \
locale-tellico-nds \
locale-tellico-nl \
locale-tellico-nn \
locale-tellico-pl \
locale-tellico-pt \
locale-tellico-pt-BR \
locale-tellico-ro \
locale-tellico-ru \
locale-tellico-sk \
locale-tellico-sl \
locale-tellico-sv \
locale-tellico-tr \
locale-tellico-ug \
locale-tellico-uk \
locale-tellico-zh-CN \
locale-tellico-zh-TW \
tellico-lang \
tellico-lang-all"

RDEPENDS:${PN} += "tellico"

inherit rpm
