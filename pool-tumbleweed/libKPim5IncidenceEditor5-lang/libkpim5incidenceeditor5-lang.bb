SUMMARY = "Translations for package libKPim5IncidenceEditor5"
DESCRIPTION = "Provides translations for the 'libKPim5IncidenceEditor5' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5IncidenceEditor5-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "559e69e7478d1bda31b0132744d11bdf3fea30c308e0e5e367e3a863f0be583ff5566d7b4c859037b3ef0f1c876cd579be5b5de9f13ad8bd7bdf2c221617b80c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5IncidenceEditor5-lang \
libKPim5IncidenceEditor5-lang-all \
locale-libKPim5IncidenceEditor5-ar \
locale-libKPim5IncidenceEditor5-bg \
locale-libKPim5IncidenceEditor5-bs \
locale-libKPim5IncidenceEditor5-ca \
locale-libKPim5IncidenceEditor5-ca@valencia \
locale-libKPim5IncidenceEditor5-cs \
locale-libKPim5IncidenceEditor5-da \
locale-libKPim5IncidenceEditor5-de \
locale-libKPim5IncidenceEditor5-el \
locale-libKPim5IncidenceEditor5-en-GB \
locale-libKPim5IncidenceEditor5-eo \
locale-libKPim5IncidenceEditor5-es \
locale-libKPim5IncidenceEditor5-et \
locale-libKPim5IncidenceEditor5-eu \
locale-libKPim5IncidenceEditor5-fi \
locale-libKPim5IncidenceEditor5-fr \
locale-libKPim5IncidenceEditor5-ga \
locale-libKPim5IncidenceEditor5-gl \
locale-libKPim5IncidenceEditor5-hu \
locale-libKPim5IncidenceEditor5-ia \
locale-libKPim5IncidenceEditor5-it \
locale-libKPim5IncidenceEditor5-ja \
locale-libKPim5IncidenceEditor5-ka \
locale-libKPim5IncidenceEditor5-kk \
locale-libKPim5IncidenceEditor5-ko \
locale-libKPim5IncidenceEditor5-lt \
locale-libKPim5IncidenceEditor5-mai \
locale-libKPim5IncidenceEditor5-mr \
locale-libKPim5IncidenceEditor5-nb \
locale-libKPim5IncidenceEditor5-nds \
locale-libKPim5IncidenceEditor5-nl \
locale-libKPim5IncidenceEditor5-pa \
locale-libKPim5IncidenceEditor5-pl \
locale-libKPim5IncidenceEditor5-pt \
locale-libKPim5IncidenceEditor5-pt-BR \
locale-libKPim5IncidenceEditor5-ro \
locale-libKPim5IncidenceEditor5-ru \
locale-libKPim5IncidenceEditor5-sk \
locale-libKPim5IncidenceEditor5-sl \
locale-libKPim5IncidenceEditor5-sv \
locale-libKPim5IncidenceEditor5-ta \
locale-libKPim5IncidenceEditor5-tr \
locale-libKPim5IncidenceEditor5-ug \
locale-libKPim5IncidenceEditor5-uk \
locale-libKPim5IncidenceEditor5-zh-CN \
locale-libKPim5IncidenceEditor5-zh-TW"

RDEPENDS:${PN} += "libKPim5IncidenceEditor5"

inherit rpm
