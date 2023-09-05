SUMMARY = "Translations for package dolphin-plugins"
DESCRIPTION = "Provides translations for the 'dolphin-plugins' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "dolphin-plugins-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "146854ba3a93c5922f2339260d2624bb31423cb255d1976e5cbe93df54b36653a0f435940c161f9a40a0201628f724828c12c59bac5d44b0de028b6253e95d74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dolphin-plugins-lang \
dolphin-plugins-lang-all \
locale-dolphin-plugins-ar \
locale-dolphin-plugins-az \
locale-dolphin-plugins-bg \
locale-dolphin-plugins-bs \
locale-dolphin-plugins-ca \
locale-dolphin-plugins-ca@valencia \
locale-dolphin-plugins-cs \
locale-dolphin-plugins-da \
locale-dolphin-plugins-de \
locale-dolphin-plugins-el \
locale-dolphin-plugins-en-GB \
locale-dolphin-plugins-eo \
locale-dolphin-plugins-es \
locale-dolphin-plugins-et \
locale-dolphin-plugins-eu \
locale-dolphin-plugins-fi \
locale-dolphin-plugins-fr \
locale-dolphin-plugins-ga \
locale-dolphin-plugins-gl \
locale-dolphin-plugins-hu \
locale-dolphin-plugins-ia \
locale-dolphin-plugins-id \
locale-dolphin-plugins-it \
locale-dolphin-plugins-ja \
locale-dolphin-plugins-ka \
locale-dolphin-plugins-kk \
locale-dolphin-plugins-ko \
locale-dolphin-plugins-lt \
locale-dolphin-plugins-mr \
locale-dolphin-plugins-nb \
locale-dolphin-plugins-nds \
locale-dolphin-plugins-nl \
locale-dolphin-plugins-nn \
locale-dolphin-plugins-pa \
locale-dolphin-plugins-pl \
locale-dolphin-plugins-pt \
locale-dolphin-plugins-pt-BR \
locale-dolphin-plugins-ro \
locale-dolphin-plugins-ru \
locale-dolphin-plugins-sk \
locale-dolphin-plugins-sl \
locale-dolphin-plugins-sv \
locale-dolphin-plugins-ta \
locale-dolphin-plugins-tr \
locale-dolphin-plugins-ug \
locale-dolphin-plugins-uk \
locale-dolphin-plugins-vi \
locale-dolphin-plugins-zh-CN \
locale-dolphin-plugins-zh-TW"

RDEPENDS:${PN} += "dolphin-plugins"

inherit rpm
