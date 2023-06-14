SUMMARY = "Translations for package gtranslator"
DESCRIPTION = "Provides translations for the 'gtranslator' package."
LICENSE = "GPL-3.0-or-later"

PV = "42.0"

RPM_NAME = "gtranslator-lang-42.0-1.6.noarch.rpm"
RPM_HASH = "086e2b1a1ec1c112327de319413c0745e24eceb6455e5734377ce353fe67da8cb376b2865993f34b751ee8cc0aa1449d540161c7afd5bc1f857e1d6b04492a57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtranslator-lang \
gtranslator-lang-all \
locale-gtranslator-ar \
locale-gtranslator-az \
locale-gtranslator-be \
locale-gtranslator-bg \
locale-gtranslator-bs \
locale-gtranslator-ca \
locale-gtranslator-ca@valencia \
locale-gtranslator-cs \
locale-gtranslator-da \
locale-gtranslator-de \
locale-gtranslator-dz \
locale-gtranslator-el \
locale-gtranslator-en-CA \
locale-gtranslator-en-GB \
locale-gtranslator-eo \
locale-gtranslator-es \
locale-gtranslator-et \
locale-gtranslator-eu \
locale-gtranslator-fa \
locale-gtranslator-fi \
locale-gtranslator-fr \
locale-gtranslator-fur \
locale-gtranslator-ga \
locale-gtranslator-gl \
locale-gtranslator-he \
locale-gtranslator-hr \
locale-gtranslator-hu \
locale-gtranslator-id \
locale-gtranslator-is \
locale-gtranslator-it \
locale-gtranslator-ja \
locale-gtranslator-ko \
locale-gtranslator-lt \
locale-gtranslator-lv \
locale-gtranslator-mk \
locale-gtranslator-nb \
locale-gtranslator-nds \
locale-gtranslator-nl \
locale-gtranslator-nn \
locale-gtranslator-oc \
locale-gtranslator-pa \
locale-gtranslator-pl \
locale-gtranslator-pt \
locale-gtranslator-pt-BR \
locale-gtranslator-ro \
locale-gtranslator-ru \
locale-gtranslator-sk \
locale-gtranslator-sl \
locale-gtranslator-sq \
locale-gtranslator-sr \
locale-gtranslator-sr@latin \
locale-gtranslator-sv \
locale-gtranslator-ta \
locale-gtranslator-te \
locale-gtranslator-th \
locale-gtranslator-tr \
locale-gtranslator-uk \
locale-gtranslator-vi \
locale-gtranslator-wa \
locale-gtranslator-zh-CN \
locale-gtranslator-zh-HK \
locale-gtranslator-zh-TW"

RDEPENDS:${PN} += "gtranslator"

inherit rpm
