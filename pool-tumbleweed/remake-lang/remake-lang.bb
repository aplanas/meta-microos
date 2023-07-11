SUMMARY = "Translations for package remake"
DESCRIPTION = "Provides translations for the 'remake' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.3_1.5"

RPM_NAME = "remake-lang-4.3_1.5-1.11.noarch.rpm"
RPM_HASH = "7d3060dcaf70a1fc525fba70e6f21246619497890ad712238c3788881c3509774c429750bf417102789c8f462db240f17fbc214c50c8ae10e15cfec6beae81e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-remake-be \
locale-remake-bg \
locale-remake-cs \
locale-remake-da \
locale-remake-de \
locale-remake-es \
locale-remake-fi \
locale-remake-fr \
locale-remake-ga \
locale-remake-gl \
locale-remake-he \
locale-remake-hr \
locale-remake-id \
locale-remake-it \
locale-remake-ja \
locale-remake-ko \
locale-remake-lt \
locale-remake-nl \
locale-remake-pl \
locale-remake-pt \
locale-remake-pt-BR \
locale-remake-ru \
locale-remake-sr \
locale-remake-sv \
locale-remake-tr \
locale-remake-uk \
locale-remake-vi \
locale-remake-zh-CN \
locale-remake-zh-TW \
remake-lang \
remake-lang-all"

RDEPENDS:${PN} += "remake"

inherit rpm
