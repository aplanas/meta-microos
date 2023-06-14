SUMMARY = "Translations for package gegl-0_4"
DESCRIPTION = "Provides translations for the 'gegl-0_4' package."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.44"

RPM_NAME = "gegl-0_4-lang-0.4.44-1.2.noarch.rpm"
RPM_HASH = "3eff809462300cc30fe8655032be5733e393a7f4e2aeafba15c6e938a5ad647af08430c489ec861127c7583cbe6d2afeab3691eca072e2e2e12fb82ff88b7bf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gegl-0-4-lang \
gegl-0-4-lang-all \
locale-gegl-0-4-bs \
locale-gegl-0-4-ca \
locale-gegl-0-4-da \
locale-gegl-0-4-de \
locale-gegl-0-4-el \
locale-gegl-0-4-en-GB \
locale-gegl-0-4-eo \
locale-gegl-0-4-es \
locale-gegl-0-4-eu \
locale-gegl-0-4-fr \
locale-gegl-0-4-gl \
locale-gegl-0-4-hr \
locale-gegl-0-4-id \
locale-gegl-0-4-is \
locale-gegl-0-4-it \
locale-gegl-0-4-ka \
locale-gegl-0-4-ko \
locale-gegl-0-4-lv \
locale-gegl-0-4-mr \
locale-gegl-0-4-nb \
locale-gegl-0-4-ne \
locale-gegl-0-4-nl \
locale-gegl-0-4-oc \
locale-gegl-0-4-pl \
locale-gegl-0-4-pt \
locale-gegl-0-4-pt-BR \
locale-gegl-0-4-ro \
locale-gegl-0-4-ru \
locale-gegl-0-4-sk \
locale-gegl-0-4-sl \
locale-gegl-0-4-sr \
locale-gegl-0-4-sr@latin \
locale-gegl-0-4-sv \
locale-gegl-0-4-tr \
locale-gegl-0-4-uk \
locale-gegl-0-4-zh-CN"

RDEPENDS:${PN} += "gegl-0-4"

inherit rpm
