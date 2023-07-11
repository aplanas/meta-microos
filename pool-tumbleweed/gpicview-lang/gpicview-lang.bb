SUMMARY = "Translations for package gpicview"
DESCRIPTION = "Provides translations for the 'gpicview' package."
LICENSE = "GPL-2.0-only"

PV = "0.2.5"

RPM_NAME = "gpicview-lang-0.2.5-2.17.noarch.rpm"
RPM_HASH = "4ed0d43951ebf2ad6cc9064b7ac4b072e44bbf146680b9dd8a234d27ce438e9b9ec3ebe65fbde071f4dc769543c2a0781639eef2b2d1566812d22da8e110474e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpicview-lang \
gpicview-lang-all \
locale-gpicview-af \
locale-gpicview-ar \
locale-gpicview-ast \
locale-gpicview-be \
locale-gpicview-bg \
locale-gpicview-bn \
locale-gpicview-bn-IN \
locale-gpicview-bs \
locale-gpicview-ca \
locale-gpicview-cs \
locale-gpicview-da \
locale-gpicview-de \
locale-gpicview-el \
locale-gpicview-en-GB \
locale-gpicview-eo \
locale-gpicview-es \
locale-gpicview-et \
locale-gpicview-eu \
locale-gpicview-fa \
locale-gpicview-fi \
locale-gpicview-fr \
locale-gpicview-gl \
locale-gpicview-he \
locale-gpicview-hr \
locale-gpicview-hu \
locale-gpicview-id \
locale-gpicview-is \
locale-gpicview-it \
locale-gpicview-ja \
locale-gpicview-kk \
locale-gpicview-kn \
locale-gpicview-ko \
locale-gpicview-lt \
locale-gpicview-ml \
locale-gpicview-ms \
locale-gpicview-nb \
locale-gpicview-nl \
locale-gpicview-nn \
locale-gpicview-pa \
locale-gpicview-pl \
locale-gpicview-pt \
locale-gpicview-pt-BR \
locale-gpicview-ro \
locale-gpicview-ru \
locale-gpicview-sk \
locale-gpicview-sr \
locale-gpicview-sr@latin \
locale-gpicview-sv \
locale-gpicview-te \
locale-gpicview-th \
locale-gpicview-tr \
locale-gpicview-ug \
locale-gpicview-uk \
locale-gpicview-vi \
locale-gpicview-zh-CN \
locale-gpicview-zh-TW"

RDEPENDS:${PN} += "gpicview"

inherit rpm
