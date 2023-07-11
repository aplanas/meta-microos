SUMMARY = "Translations for package easytag"
DESCRIPTION = "Provides translations for the 'easytag' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.3"

RPM_NAME = "easytag-lang-2.4.3-7.5.noarch.rpm"
RPM_HASH = "7791cbef6ac45fc75e8bd48e623e1b3ad207c067be8c8fe94dfead0fa01aee7cb2e6a313f2dd620333bbd293fbe92dff7d82fed776eaf919adf17d83d760db10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easytag-lang \
easytag-lang-all \
locale-easytag-bg \
locale-easytag-bs \
locale-easytag-ca \
locale-easytag-cs \
locale-easytag-da \
locale-easytag-de \
locale-easytag-el \
locale-easytag-en-GB \
locale-easytag-es \
locale-easytag-fr \
locale-easytag-he \
locale-easytag-hr \
locale-easytag-hu \
locale-easytag-id \
locale-easytag-it \
locale-easytag-ja \
locale-easytag-ko \
locale-easytag-lt \
locale-easytag-nb \
locale-easytag-nl \
locale-easytag-oc \
locale-easytag-pl \
locale-easytag-pt \
locale-easytag-pt-BR \
locale-easytag-ro \
locale-easytag-ru \
locale-easytag-sl \
locale-easytag-sr \
locale-easytag-sr@latin \
locale-easytag-sv \
locale-easytag-te \
locale-easytag-tr \
locale-easytag-uk \
locale-easytag-zh-CN \
locale-easytag-zh-TW"

RDEPENDS:${PN} += "easytag"

inherit rpm
