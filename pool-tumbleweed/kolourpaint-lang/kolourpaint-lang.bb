SUMMARY = "Translations for package kolourpaint"
DESCRIPTION = "Provides translations for the 'kolourpaint' package."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & GFDL-1.2-or-later & GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "kolourpaint-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "653f2807ee156da15c804af5a3d672f1f9c780bf4bb5aae6e20e7b238db1fe59208664cc94efc44c9b40716bdb08ab3bd397f4e582e2e17f449b49619a670c82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kolourpaint-lang \
kolourpaint-lang-all \
locale-kolourpaint-ar \
locale-kolourpaint-be \
locale-kolourpaint-bg \
locale-kolourpaint-br \
locale-kolourpaint-bs \
locale-kolourpaint-ca \
locale-kolourpaint-ca@valencia \
locale-kolourpaint-cs \
locale-kolourpaint-cy \
locale-kolourpaint-da \
locale-kolourpaint-de \
locale-kolourpaint-el \
locale-kolourpaint-en-GB \
locale-kolourpaint-eo \
locale-kolourpaint-es \
locale-kolourpaint-et \
locale-kolourpaint-eu \
locale-kolourpaint-fa \
locale-kolourpaint-fi \
locale-kolourpaint-fr \
locale-kolourpaint-ga \
locale-kolourpaint-gl \
locale-kolourpaint-he \
locale-kolourpaint-hi \
locale-kolourpaint-hr \
locale-kolourpaint-hu \
locale-kolourpaint-ia \
locale-kolourpaint-id \
locale-kolourpaint-is \
locale-kolourpaint-it \
locale-kolourpaint-ja \
locale-kolourpaint-ka \
locale-kolourpaint-kk \
locale-kolourpaint-km \
locale-kolourpaint-ko \
locale-kolourpaint-lt \
locale-kolourpaint-lv \
locale-kolourpaint-mk \
locale-kolourpaint-ml \
locale-kolourpaint-mr \
locale-kolourpaint-ms \
locale-kolourpaint-nb \
locale-kolourpaint-nds \
locale-kolourpaint-ne \
locale-kolourpaint-nl \
locale-kolourpaint-nn \
locale-kolourpaint-oc \
locale-kolourpaint-pa \
locale-kolourpaint-pl \
locale-kolourpaint-pt \
locale-kolourpaint-pt-BR \
locale-kolourpaint-ro \
locale-kolourpaint-ru \
locale-kolourpaint-si \
locale-kolourpaint-sk \
locale-kolourpaint-sl \
locale-kolourpaint-sq \
locale-kolourpaint-sv \
locale-kolourpaint-ta \
locale-kolourpaint-th \
locale-kolourpaint-tr \
locale-kolourpaint-ug \
locale-kolourpaint-uk \
locale-kolourpaint-zh-CN \
locale-kolourpaint-zh-HK \
locale-kolourpaint-zh-TW"

RDEPENDS:${PN} += "kolourpaint"

inherit rpm
