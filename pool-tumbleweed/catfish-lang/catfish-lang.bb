SUMMARY = "Translations for package catfish"
DESCRIPTION = "Provides translations for the 'catfish' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.16.4"

RPM_NAME = "catfish-lang-4.16.4-1.4.noarch.rpm"
RPM_HASH = "55a2038261b45a4f59b77a6d71d050ae26108cfeaf9995b9903b6f719d502ee43349a7b18adb2eca25a8ae125053604c1dd3e3d9917eb1a6204a84259e4fbc81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "catfish-lang \
catfish-lang-all \
locale-catfish-af \
locale-catfish-ar \
locale-catfish-be \
locale-catfish-bg \
locale-catfish-ca \
locale-catfish-cs \
locale-catfish-da \
locale-catfish-de \
locale-catfish-el \
locale-catfish-en-AU \
locale-catfish-eo \
locale-catfish-es \
locale-catfish-et \
locale-catfish-eu \
locale-catfish-fi \
locale-catfish-fr \
locale-catfish-gl \
locale-catfish-he \
locale-catfish-hr \
locale-catfish-hu \
locale-catfish-id \
locale-catfish-is \
locale-catfish-it \
locale-catfish-ja \
locale-catfish-ko \
locale-catfish-lt \
locale-catfish-lv \
locale-catfish-ml \
locale-catfish-ms \
locale-catfish-nb \
locale-catfish-nl \
locale-catfish-nn \
locale-catfish-pl \
locale-catfish-pt \
locale-catfish-pt-BR \
locale-catfish-ru \
locale-catfish-si \
locale-catfish-sk \
locale-catfish-sl \
locale-catfish-sq \
locale-catfish-sr \
locale-catfish-sv \
locale-catfish-th \
locale-catfish-tr \
locale-catfish-uk \
locale-catfish-zh-CN \
locale-catfish-zh-TW"

RDEPENDS:${PN} += "catfish"

inherit rpm
