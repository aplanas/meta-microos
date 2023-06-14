SUMMARY = "Translations for package haruna"
DESCRIPTION = "Provides translations for the 'haruna' package."
LICENSE = "CC-BY-4.0 & GPL-3.0-or-later & WTFPL"

PV = "0.11.1"

RPM_NAME = "haruna-lang-0.11.1-1.1.noarch.rpm"
RPM_HASH = "28b8513abb44073df6d488e70a7d7dc846aa6c2e8bb462c90f259c827d927b174a30f1ccf85ee063a03fad046bbf42bc39043d187ce5741bc8269a01e5356ea1"
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
