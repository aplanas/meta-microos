SUMMARY = "Translations for package avahi"
DESCRIPTION = "Provides translations for the 'avahi' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-lang-0.8-23.3.noarch.rpm"
RPM_HASH = "abc6c7fd13016a24a40dff2157b093645ce79bd0ffc03b66c9ea19eb6fd6eb14f365252e32dcfbd8756b58be552dc94c7b3f48b9b93c324302d175361135744a"
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
