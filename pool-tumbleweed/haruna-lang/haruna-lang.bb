SUMMARY = "Translations for package haruna"
DESCRIPTION = "Provides translations for the 'haruna' package."
LICENSE = "CC-BY-4.0 & GPL-3.0-or-later & WTFPL"

PV = "0.11.2"

RPM_NAME = "haruna-lang-0.11.2-1.1.noarch.rpm"
RPM_HASH = "357f0df4bf5b9cf99a760cdb67c7a6ad19d5e60519ff0c0e9e85b0e3c5ae6a1074b05d59533f03d62431c498e6fb6b1b4e6f928915b41fe3e58e5fc93ecece83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "haruna-lang \
haruna-lang-all \
locale-haruna-ar \
locale-haruna-ca \
locale-haruna-ca@valencia \
locale-haruna-cs \
locale-haruna-de \
locale-haruna-en-GB \
locale-haruna-es \
locale-haruna-eu \
locale-haruna-fi \
locale-haruna-fr \
locale-haruna-hi \
locale-haruna-id \
locale-haruna-it \
locale-haruna-ja \
locale-haruna-ka \
locale-haruna-ko \
locale-haruna-lt \
locale-haruna-nl \
locale-haruna-pl \
locale-haruna-pt \
locale-haruna-pt-BR \
locale-haruna-ru \
locale-haruna-sk \
locale-haruna-sl \
locale-haruna-sv \
locale-haruna-ta \
locale-haruna-tr \
locale-haruna-uk \
locale-haruna-zh-CN \
locale-haruna-zh-TW"

RDEPENDS:${PN} += "haruna"

inherit rpm
