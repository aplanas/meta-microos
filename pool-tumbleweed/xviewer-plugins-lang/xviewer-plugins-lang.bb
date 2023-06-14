SUMMARY = "Translations for package xviewer-plugins"
DESCRIPTION = "Provides translations for the 'xviewer-plugins' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugins-lang-1.4.1-1.6.noarch.rpm"
RPM_HASH = "9bfce36f3a69a44490b64817c924a77d9d9fd723bcf2bd466eeb7ab76c6541da32dba5701c764f589ba0258a4d7830b696d12db8311b73e600f123bab14181a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xviewer-plugins-ar \
locale-xviewer-plugins-as \
locale-xviewer-plugins-be@latin \
locale-xviewer-plugins-bg \
locale-xviewer-plugins-bn-IN \
locale-xviewer-plugins-ca \
locale-xviewer-plugins-ca@valencia \
locale-xviewer-plugins-cs \
locale-xviewer-plugins-da \
locale-xviewer-plugins-de \
locale-xviewer-plugins-el \
locale-xviewer-plugins-en-GB \
locale-xviewer-plugins-es \
locale-xviewer-plugins-eu \
locale-xviewer-plugins-fi \
locale-xviewer-plugins-fr \
locale-xviewer-plugins-gl \
locale-xviewer-plugins-gu \
locale-xviewer-plugins-he \
locale-xviewer-plugins-hr \
locale-xviewer-plugins-hu \
locale-xviewer-plugins-id \
locale-xviewer-plugins-it \
locale-xviewer-plugins-ja \
locale-xviewer-plugins-kn \
locale-xviewer-plugins-ko \
locale-xviewer-plugins-lt \
locale-xviewer-plugins-lv \
locale-xviewer-plugins-mk \
locale-xviewer-plugins-ml \
locale-xviewer-plugins-mr \
locale-xviewer-plugins-nb \
locale-xviewer-plugins-or \
locale-xviewer-plugins-pa \
locale-xviewer-plugins-pl \
locale-xviewer-plugins-pt \
locale-xviewer-plugins-pt-BR \
locale-xviewer-plugins-ro \
locale-xviewer-plugins-ru \
locale-xviewer-plugins-sk \
locale-xviewer-plugins-sl \
locale-xviewer-plugins-sq \
locale-xviewer-plugins-sr \
locale-xviewer-plugins-sr@latin \
locale-xviewer-plugins-sv \
locale-xviewer-plugins-ta \
locale-xviewer-plugins-te \
locale-xviewer-plugins-uk \
locale-xviewer-plugins-vi \
locale-xviewer-plugins-zh-CN \
locale-xviewer-plugins-zh-HK \
locale-xviewer-plugins-zh-TW \
xviewer-plugins-lang \
xviewer-plugins-lang-all"

RDEPENDS:${PN} += "xviewer-plugins"

inherit rpm
