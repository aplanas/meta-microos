SUMMARY = "Translations for package gimp-gap"
DESCRIPTION = "Provides translations for the 'gimp-gap' package."
LICENSE = "GPL-2.0"

PV = "2.6.0"

RPM_NAME = "gimp-gap-lang-2.6.0-29.33.noarch.rpm"
RPM_HASH = "af61356b28472cdecad6d201ca15feccc6e05319d46184f8a0154c3c20e70fd962e45af5d9e6a27790d6d23084ed246091a398ecb0b348ba8585c07e664a5dbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-gap-lang \
gimp-gap-lang-all \
locale-gimp-gap-ar \
locale-gimp-gap-az \
locale-gimp-gap-bg \
locale-gimp-gap-ca \
locale-gimp-gap-cs \
locale-gimp-gap-da \
locale-gimp-gap-de \
locale-gimp-gap-dz \
locale-gimp-gap-el \
locale-gimp-gap-en-CA \
locale-gimp-gap-en-GB \
locale-gimp-gap-es \
locale-gimp-gap-eu \
locale-gimp-gap-fi \
locale-gimp-gap-fr \
locale-gimp-gap-gl \
locale-gimp-gap-gu \
locale-gimp-gap-hi \
locale-gimp-gap-hr \
locale-gimp-gap-hu \
locale-gimp-gap-it \
locale-gimp-gap-ja \
locale-gimp-gap-ko \
locale-gimp-gap-lt \
locale-gimp-gap-ml \
locale-gimp-gap-mr \
locale-gimp-gap-nb \
locale-gimp-gap-ne \
locale-gimp-gap-nl \
locale-gimp-gap-nn \
locale-gimp-gap-oc \
locale-gimp-gap-pa \
locale-gimp-gap-pl \
locale-gimp-gap-pt \
locale-gimp-gap-pt-BR \
locale-gimp-gap-ru \
locale-gimp-gap-sk \
locale-gimp-gap-sl \
locale-gimp-gap-sq \
locale-gimp-gap-sr \
locale-gimp-gap-sr@latin \
locale-gimp-gap-sv \
locale-gimp-gap-tr \
locale-gimp-gap-uk \
locale-gimp-gap-vi \
locale-gimp-gap-zh-CN \
locale-gimp-gap-zh-TW"

RDEPENDS:${PN} += "gimp-gap"

inherit rpm
