SUMMARY = "Translations for package gramps"
DESCRIPTION = "Provides translations for the 'gramps' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.5"

RPM_NAME = "gramps-lang-5.1.5-1.8.noarch.rpm"
RPM_HASH = "2864d718b5157dfb1b848960b9e4e9cb80ad43522b895438089598eb253683aede6d16f7842b2c136c76c45fe7e8042cc128428785ae1734a3bdcc6eaaa9c709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gramps-lang \
gramps-lang-all \
locale-gramps-ar \
locale-gramps-bg \
locale-gramps-ca \
locale-gramps-cs \
locale-gramps-da \
locale-gramps-de \
locale-gramps-el \
locale-gramps-en-GB \
locale-gramps-eo \
locale-gramps-es \
locale-gramps-fi \
locale-gramps-fr \
locale-gramps-he \
locale-gramps-hr \
locale-gramps-hu \
locale-gramps-is \
locale-gramps-it \
locale-gramps-ja \
locale-gramps-lt \
locale-gramps-nb \
locale-gramps-nl \
locale-gramps-nn \
locale-gramps-pl \
locale-gramps-pt-BR \
locale-gramps-pt-PT \
locale-gramps-ru \
locale-gramps-sk \
locale-gramps-sl \
locale-gramps-sq \
locale-gramps-sr \
locale-gramps-sv \
locale-gramps-ta \
locale-gramps-tr \
locale-gramps-uk \
locale-gramps-vi \
locale-gramps-zh-CN \
locale-gramps-zh-HK \
locale-gramps-zh-TW"

RDEPENDS:${PN} += "gramps"

inherit rpm
