SUMMARY = "Translations for package avahi"
DESCRIPTION = "Provides translations for the 'avahi' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-lang-0.8-23.1.noarch.rpm"
RPM_HASH = "84dd3a3dade737227944a99747ebcddff6ce730849f189eed94aef6d62ecdb95c6e89c225cf8aaf84118ae92f6d2ca6852fa54c232e806974ce6d998971b1fa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avahi-lang \
avahi-lang-all \
locale-avahi-ar \
locale-avahi-bg \
locale-avahi-ca \
locale-avahi-cs \
locale-avahi-da \
locale-avahi-de \
locale-avahi-el \
locale-avahi-en-AU \
locale-avahi-en-CA \
locale-avahi-en-GB \
locale-avahi-en-NZ \
locale-avahi-eo \
locale-avahi-es \
locale-avahi-et \
locale-avahi-fa \
locale-avahi-fi \
locale-avahi-fr \
locale-avahi-gl \
locale-avahi-he \
locale-avahi-hu \
locale-avahi-id \
locale-avahi-it \
locale-avahi-ja \
locale-avahi-ko \
locale-avahi-lv \
locale-avahi-ms \
locale-avahi-nl \
locale-avahi-oc \
locale-avahi-pl \
locale-avahi-pt-BR \
locale-avahi-ro \
locale-avahi-ru \
locale-avahi-sk \
locale-avahi-sl \
locale-avahi-sr \
locale-avahi-sr@latin \
locale-avahi-sv \
locale-avahi-tr \
locale-avahi-uk \
locale-avahi-zh-CN \
locale-avahi-zh-TW"

RDEPENDS:${PN} += "avahi"

inherit rpm
