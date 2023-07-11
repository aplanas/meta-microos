SUMMARY = "Translations for package gcr"
DESCRIPTION = "Provides translations for the 'gcr' package."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "gcr-lang-4.1.0-1.2.noarch.rpm"
RPM_HASH = "cfda0e38670575f0960d2af4832f0d6f5579fd6579365a6aa3a1f478f64146444eb361acbede1cde5d4f290575a6eb09db471971d225d17f87670983ec839c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcr-lang \
gcr-lang-all \
locale-gcr-af \
locale-gcr-ar \
locale-gcr-as \
locale-gcr-ast \
locale-gcr-az \
locale-gcr-be \
locale-gcr-be@latin \
locale-gcr-bg \
locale-gcr-bn \
locale-gcr-bn-IN \
locale-gcr-bs \
locale-gcr-ca \
locale-gcr-ca@valencia \
locale-gcr-cs \
locale-gcr-cy \
locale-gcr-da \
locale-gcr-de \
locale-gcr-dz \
locale-gcr-el \
locale-gcr-en-CA \
locale-gcr-en-GB \
locale-gcr-en@shaw \
locale-gcr-eo \
locale-gcr-es \
locale-gcr-et \
locale-gcr-eu \
locale-gcr-fa \
locale-gcr-fi \
locale-gcr-fr \
locale-gcr-fur \
locale-gcr-ga \
locale-gcr-gl \
locale-gcr-gu \
locale-gcr-he \
locale-gcr-hi \
locale-gcr-hr \
locale-gcr-hu \
locale-gcr-id \
locale-gcr-is \
locale-gcr-it \
locale-gcr-ja \
locale-gcr-ka \
locale-gcr-kk \
locale-gcr-kn \
locale-gcr-ko \
locale-gcr-lt \
locale-gcr-lv \
locale-gcr-mai \
locale-gcr-mk \
locale-gcr-ml \
locale-gcr-mr \
locale-gcr-ms \
locale-gcr-nb \
locale-gcr-ne \
locale-gcr-nl \
locale-gcr-nn \
locale-gcr-oc \
locale-gcr-or \
locale-gcr-pa \
locale-gcr-pl \
locale-gcr-pt \
locale-gcr-pt-BR \
locale-gcr-ro \
locale-gcr-ru \
locale-gcr-si \
locale-gcr-sk \
locale-gcr-sl \
locale-gcr-sq \
locale-gcr-sr \
locale-gcr-sr@latin \
locale-gcr-sv \
locale-gcr-ta \
locale-gcr-te \
locale-gcr-th \
locale-gcr-tr \
locale-gcr-ug \
locale-gcr-uk \
locale-gcr-vi \
locale-gcr-zh-CN \
locale-gcr-zh-HK \
locale-gcr-zh-TW"

RDEPENDS:${PN} += "gcr"

inherit rpm
