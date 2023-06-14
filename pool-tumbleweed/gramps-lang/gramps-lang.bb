SUMMARY = "Translations for package gramps"
DESCRIPTION = "Provides translations for the 'gramps' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.5"

RPM_NAME = "gramps-lang-5.1.5-1.7.noarch.rpm"
RPM_HASH = "55268c39063c33249b0a0f72f3715705fb2f3ebf74d1c0312897b6db041f935e9c1f10fc275d41be81757633d05bdb82f76aa52f7c3c7392a83e8f184d9dab58"
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
