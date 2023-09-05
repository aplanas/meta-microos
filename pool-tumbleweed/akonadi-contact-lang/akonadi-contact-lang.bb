SUMMARY = "Translations for package akonadi-contact"
DESCRIPTION = "Provides translations for the 'akonadi-contact' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-contact-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "1c51415b11e673af23501a351d0a238ffd3d874f90444ae10c4129328423e3246aa185736893156320fe882c921238fc93119bca4f790d91caf29310098f99b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadi-contact-lang \
akonadi-contact-lang-all \
locale-akonadi-contact-ar \
locale-akonadi-contact-az \
locale-akonadi-contact-bg \
locale-akonadi-contact-bs \
locale-akonadi-contact-ca \
locale-akonadi-contact-ca@valencia \
locale-akonadi-contact-cs \
locale-akonadi-contact-da \
locale-akonadi-contact-de \
locale-akonadi-contact-el \
locale-akonadi-contact-en-GB \
locale-akonadi-contact-eo \
locale-akonadi-contact-es \
locale-akonadi-contact-et \
locale-akonadi-contact-eu \
locale-akonadi-contact-fi \
locale-akonadi-contact-fr \
locale-akonadi-contact-ga \
locale-akonadi-contact-gl \
locale-akonadi-contact-he \
locale-akonadi-contact-hr \
locale-akonadi-contact-hu \
locale-akonadi-contact-ia \
locale-akonadi-contact-it \
locale-akonadi-contact-ja \
locale-akonadi-contact-ka \
locale-akonadi-contact-kk \
locale-akonadi-contact-km \
locale-akonadi-contact-ko \
locale-akonadi-contact-lt \
locale-akonadi-contact-lv \
locale-akonadi-contact-mai \
locale-akonadi-contact-mr \
locale-akonadi-contact-nb \
locale-akonadi-contact-nds \
locale-akonadi-contact-nl \
locale-akonadi-contact-nn \
locale-akonadi-contact-pa \
locale-akonadi-contact-pl \
locale-akonadi-contact-pt \
locale-akonadi-contact-pt-BR \
locale-akonadi-contact-ro \
locale-akonadi-contact-ru \
locale-akonadi-contact-sk \
locale-akonadi-contact-sl \
locale-akonadi-contact-sr \
locale-akonadi-contact-sr@ijekavian \
locale-akonadi-contact-sr@ijekavianlatin \
locale-akonadi-contact-sr@latin \
locale-akonadi-contact-sv \
locale-akonadi-contact-tr \
locale-akonadi-contact-ug \
locale-akonadi-contact-uk \
locale-akonadi-contact-zh-CN \
locale-akonadi-contact-zh-TW"

RDEPENDS:${PN} += "akonadi-contact"

inherit rpm
