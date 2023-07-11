SUMMARY = "Translations for package pan"
DESCRIPTION = "Provides translations for the 'pan' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.154"

RPM_NAME = "pan-lang-0.154-2.4.noarch.rpm"
RPM_HASH = "95d8c08af60827afa302838344de32f333d4391d55c0fab270f97164106d13d0977b87be827e4aefdc46135c1d23f29753bca1b66a8f7a587032a2954d94905d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pan-ar \
locale-pan-az \
locale-pan-bg \
locale-pan-bs \
locale-pan-ca \
locale-pan-cs \
locale-pan-da \
locale-pan-de \
locale-pan-dz \
locale-pan-el \
locale-pan-en-CA \
locale-pan-en-GB \
locale-pan-eo \
locale-pan-es \
locale-pan-et \
locale-pan-eu \
locale-pan-fi \
locale-pan-fr \
locale-pan-ga \
locale-pan-gl \
locale-pan-hr \
locale-pan-hu \
locale-pan-id \
locale-pan-it \
locale-pan-ja \
locale-pan-ko \
locale-pan-lt \
locale-pan-lv \
locale-pan-ms \
locale-pan-nb \
locale-pan-nl \
locale-pan-oc \
locale-pan-pl \
locale-pan-pt \
locale-pan-pt-BR \
locale-pan-ro \
locale-pan-ru \
locale-pan-sk \
locale-pan-sl \
locale-pan-sq \
locale-pan-sr \
locale-pan-sr@latin \
locale-pan-sv \
locale-pan-tr \
locale-pan-uk \
locale-pan-vi \
locale-pan-zh-CN \
locale-pan-zh-TW \
pan-lang \
pan-lang-all"

RDEPENDS:${PN} += "pan"

inherit rpm
