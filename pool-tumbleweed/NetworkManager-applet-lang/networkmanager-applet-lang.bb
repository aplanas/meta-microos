SUMMARY = "Translations for package NetworkManager-applet"
DESCRIPTION = "Provides translations for the 'NetworkManager-applet' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.32.0"

RPM_NAME = "NetworkManager-applet-lang-1.32.0-1.2.noarch.rpm"
RPM_HASH = "16b5bcbf98f41da123f6d34c5c636b6fcaf7f6f1c16ab138b8fdd7bfbf938475ec8096faf9f91bb7887c0e53992272fa4651cb498fa59315aae11ff80e1bf2de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-applet-lang \
NetworkManager-applet-lang-all \
locale-NetworkManager-applet-af \
locale-NetworkManager-applet-ar \
locale-NetworkManager-applet-as \
locale-NetworkManager-applet-ast \
locale-NetworkManager-applet-be \
locale-NetworkManager-applet-be@latin \
locale-NetworkManager-applet-bg \
locale-NetworkManager-applet-bn-IN \
locale-NetworkManager-applet-bs \
locale-NetworkManager-applet-ca \
locale-NetworkManager-applet-ca@valencia \
locale-NetworkManager-applet-cs \
locale-NetworkManager-applet-da \
locale-NetworkManager-applet-de \
locale-NetworkManager-applet-dz \
locale-NetworkManager-applet-el \
locale-NetworkManager-applet-en-CA \
locale-NetworkManager-applet-en-GB \
locale-NetworkManager-applet-eo \
locale-NetworkManager-applet-es \
locale-NetworkManager-applet-et \
locale-NetworkManager-applet-eu \
locale-NetworkManager-applet-fa \
locale-NetworkManager-applet-fi \
locale-NetworkManager-applet-fr \
locale-NetworkManager-applet-gd \
locale-NetworkManager-applet-gl \
locale-NetworkManager-applet-gu \
locale-NetworkManager-applet-he \
locale-NetworkManager-applet-hi \
locale-NetworkManager-applet-hr \
locale-NetworkManager-applet-hu \
locale-NetworkManager-applet-id \
locale-NetworkManager-applet-is \
locale-NetworkManager-applet-it \
locale-NetworkManager-applet-ja \
locale-NetworkManager-applet-ka \
locale-NetworkManager-applet-kk \
locale-NetworkManager-applet-km \
locale-NetworkManager-applet-kn \
locale-NetworkManager-applet-ko \
locale-NetworkManager-applet-lt \
locale-NetworkManager-applet-lv \
locale-NetworkManager-applet-mk \
locale-NetworkManager-applet-ml \
locale-NetworkManager-applet-mr \
locale-NetworkManager-applet-ms \
locale-NetworkManager-applet-nb \
locale-NetworkManager-applet-ne \
locale-NetworkManager-applet-nl \
locale-NetworkManager-applet-nn \
locale-NetworkManager-applet-oc \
locale-NetworkManager-applet-or \
locale-NetworkManager-applet-pa \
locale-NetworkManager-applet-pl \
locale-NetworkManager-applet-pt \
locale-NetworkManager-applet-pt-BR \
locale-NetworkManager-applet-ro \
locale-NetworkManager-applet-ru \
locale-NetworkManager-applet-sk \
locale-NetworkManager-applet-sl \
locale-NetworkManager-applet-sq \
locale-NetworkManager-applet-sr \
locale-NetworkManager-applet-sr@latin \
locale-NetworkManager-applet-sv \
locale-NetworkManager-applet-ta \
locale-NetworkManager-applet-te \
locale-NetworkManager-applet-th \
locale-NetworkManager-applet-tr \
locale-NetworkManager-applet-ug \
locale-NetworkManager-applet-uk \
locale-NetworkManager-applet-vi \
locale-NetworkManager-applet-wa \
locale-NetworkManager-applet-zh-CN \
locale-NetworkManager-applet-zh-HK \
locale-NetworkManager-applet-zh-TW"

RDEPENDS:${PN} += "NetworkManager-applet"

inherit rpm
