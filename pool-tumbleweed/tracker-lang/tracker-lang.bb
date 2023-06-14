SUMMARY = "Translations for package tracker"
DESCRIPTION = "Provides translations for the 'tracker' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.3"

RPM_NAME = "tracker-lang-3.5.3-1.1.noarch.rpm"
RPM_HASH = "c7eae677894278ea2c34ecd38ca7b1229230f21dea920f7e6b0c19e39903d6a58d4f234ad2e172a384eb3dc3cc94a092585294f31df0fd1e49ce6a86468a691a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tracker-ar \
locale-tracker-as \
locale-tracker-be \
locale-tracker-be@latin \
locale-tracker-bg \
locale-tracker-bs \
locale-tracker-ca \
locale-tracker-ca@valencia \
locale-tracker-cs \
locale-tracker-da \
locale-tracker-de \
locale-tracker-dz \
locale-tracker-el \
locale-tracker-en-GB \
locale-tracker-eo \
locale-tracker-es \
locale-tracker-et \
locale-tracker-eu \
locale-tracker-fi \
locale-tracker-fr \
locale-tracker-fur \
locale-tracker-gl \
locale-tracker-he \
locale-tracker-hr \
locale-tracker-hu \
locale-tracker-id \
locale-tracker-is \
locale-tracker-it \
locale-tracker-ja \
locale-tracker-ka \
locale-tracker-kk \
locale-tracker-ko \
locale-tracker-lt \
locale-tracker-lv \
locale-tracker-mk \
locale-tracker-ml \
locale-tracker-ms \
locale-tracker-nb \
locale-tracker-nds \
locale-tracker-ne \
locale-tracker-nl \
locale-tracker-oc \
locale-tracker-pa \
locale-tracker-pl \
locale-tracker-pt \
locale-tracker-pt-BR \
locale-tracker-ro \
locale-tracker-ru \
locale-tracker-sk \
locale-tracker-sl \
locale-tracker-sr \
locale-tracker-sr@latin \
locale-tracker-sv \
locale-tracker-te \
locale-tracker-th \
locale-tracker-tr \
locale-tracker-uk \
locale-tracker-vi \
locale-tracker-zh-CN \
locale-tracker-zh-HK \
locale-tracker-zh-TW \
tracker-lang \
tracker-lang-all"

RDEPENDS:${PN} += "tracker"

inherit rpm
