SUMMARY = "Translations for package sed"
DESCRIPTION = "Provides translations for the 'sed' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.9"

RPM_NAME = "sed-lang-4.9-2.4.noarch.rpm"
RPM_HASH = "eeb1ab4f87f26541359e548e9301389939719bfe7b39969e9bcc94f6dcbafc0c85b515955af9aa2021eea36c46f2300e53580d19b6aed3127d8062c86a08b788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-sed-af \
locale-sed-ast \
locale-sed-bg \
locale-sed-ca \
locale-sed-cs \
locale-sed-da \
locale-sed-de \
locale-sed-el \
locale-sed-eo \
locale-sed-es \
locale-sed-et \
locale-sed-eu \
locale-sed-fi \
locale-sed-fr \
locale-sed-ga \
locale-sed-gl \
locale-sed-he \
locale-sed-hr \
locale-sed-hu \
locale-sed-id \
locale-sed-it \
locale-sed-ja \
locale-sed-ka \
locale-sed-ko \
locale-sed-nb \
locale-sed-nl \
locale-sed-pl \
locale-sed-pt \
locale-sed-pt-BR \
locale-sed-ro \
locale-sed-ru \
locale-sed-sk \
locale-sed-sl \
locale-sed-sr \
locale-sed-sv \
locale-sed-tr \
locale-sed-uk \
locale-sed-vi \
locale-sed-zh-CN \
locale-sed-zh-TW \
sed-lang \
sed-lang-all"

RDEPENDS:${PN} += "sed"

inherit rpm
