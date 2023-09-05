SUMMARY = "Translations for package markdownpart"
DESCRIPTION = "Provides translations for the 'markdownpart' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "markdownpart-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "cea2b14ea6359c49a2062c64e7495324153eccba9cf1593f83b79b9027e688a4a57b8c487549b52349e1e91c0cf9d6515f70b0165604b93efb1ae20f8a702de3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-markdownpart-ar \
locale-markdownpart-ca \
locale-markdownpart-ca@valencia \
locale-markdownpart-cs \
locale-markdownpart-de \
locale-markdownpart-el \
locale-markdownpart-en-GB \
locale-markdownpart-es \
locale-markdownpart-et \
locale-markdownpart-eu \
locale-markdownpart-fi \
locale-markdownpart-fr \
locale-markdownpart-gl \
locale-markdownpart-hi \
locale-markdownpart-it \
locale-markdownpart-ja \
locale-markdownpart-ka \
locale-markdownpart-ko \
locale-markdownpart-lt \
locale-markdownpart-nl \
locale-markdownpart-nn \
locale-markdownpart-pl \
locale-markdownpart-pt \
locale-markdownpart-pt-BR \
locale-markdownpart-ro \
locale-markdownpart-ru \
locale-markdownpart-sk \
locale-markdownpart-sl \
locale-markdownpart-sv \
locale-markdownpart-tr \
locale-markdownpart-uk \
locale-markdownpart-vi \
locale-markdownpart-zh-CN \
locale-markdownpart-zh-TW \
markdownpart-lang \
markdownpart-lang-all"

RDEPENDS:${PN} += "markdownpart"

inherit rpm
