SUMMARY = "Translations for package haruna"
DESCRIPTION = "Provides translations for the 'haruna' package."
LICENSE = "CC-BY-4.0 & GPL-3.0-or-later & WTFPL"

PV = "0.11.1"

RPM_NAME = "haruna-lang-0.11.1-1.3.noarch.rpm"
RPM_HASH = "7934605648743d9bd5182769db8172a7cd4a8c003f0212d45ceed8e5df3e10945e0a6ab84bb2fb6ce930ffb290efd29c571d14e1c7b1d37bbfd7f8e524c850f6"
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
