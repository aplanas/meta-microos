SUMMARY = "Translations for package thunar-plugin-vcs"
DESCRIPTION = "Provides translations for the 'thunar-plugin-vcs' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "thunar-plugin-vcs-lang-0.2.0-1.24.noarch.rpm"
RPM_HASH = "d2874ce6ec45a59ae24366064ae0d9e8047c88497619f3f885f80c6415b2c6aa898853e6508c0f15ada4c731ce5b7b6210976adc284456cbab8ae42d0ef71a94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-thunar-plugin-vcs-ar \
locale-thunar-plugin-vcs-be \
locale-thunar-plugin-vcs-bg \
locale-thunar-plugin-vcs-ca \
locale-thunar-plugin-vcs-cs \
locale-thunar-plugin-vcs-da \
locale-thunar-plugin-vcs-de \
locale-thunar-plugin-vcs-el \
locale-thunar-plugin-vcs-en-AU \
locale-thunar-plugin-vcs-en-GB \
locale-thunar-plugin-vcs-es \
locale-thunar-plugin-vcs-eu \
locale-thunar-plugin-vcs-fi \
locale-thunar-plugin-vcs-fr \
locale-thunar-plugin-vcs-gl \
locale-thunar-plugin-vcs-he \
locale-thunar-plugin-vcs-hr \
locale-thunar-plugin-vcs-hu \
locale-thunar-plugin-vcs-id \
locale-thunar-plugin-vcs-is \
locale-thunar-plugin-vcs-it \
locale-thunar-plugin-vcs-ko \
locale-thunar-plugin-vcs-lt \
locale-thunar-plugin-vcs-lv \
locale-thunar-plugin-vcs-ms \
locale-thunar-plugin-vcs-nb \
locale-thunar-plugin-vcs-nl \
locale-thunar-plugin-vcs-oc \
locale-thunar-plugin-vcs-pl \
locale-thunar-plugin-vcs-pt \
locale-thunar-plugin-vcs-pt-BR \
locale-thunar-plugin-vcs-ru \
locale-thunar-plugin-vcs-sk \
locale-thunar-plugin-vcs-sl \
locale-thunar-plugin-vcs-sv \
locale-thunar-plugin-vcs-th \
locale-thunar-plugin-vcs-tr \
locale-thunar-plugin-vcs-ug \
locale-thunar-plugin-vcs-uk \
locale-thunar-plugin-vcs-zh-CN \
locale-thunar-plugin-vcs-zh-TW \
thunar-plugin-vcs-lang \
thunar-plugin-vcs-lang-all"

RDEPENDS:${PN} += "thunar-plugin-vcs"

inherit rpm
