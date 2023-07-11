SUMMARY = "Translations for package wget"
DESCRIPTION = "Provides translations for the 'wget' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.21.4"

RPM_NAME = "wget-lang-1.21.4-2.1.noarch.rpm"
RPM_HASH = "541044ee1a2f3b47b1a6a25852c0cd0e639640b9f6d0b6ece1ce53f80286d713feb820a8e61e900f91eff9de8754d4a0302a43e1145f1f1dce4c7a928ceac557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wget-af \
locale-wget-be \
locale-wget-bg \
locale-wget-ca \
locale-wget-cs \
locale-wget-da \
locale-wget-de \
locale-wget-el \
locale-wget-en-GB \
locale-wget-eo \
locale-wget-es \
locale-wget-et \
locale-wget-eu \
locale-wget-fi \
locale-wget-fr \
locale-wget-ga \
locale-wget-gl \
locale-wget-he \
locale-wget-hr \
locale-wget-hu \
locale-wget-id \
locale-wget-it \
locale-wget-ja \
locale-wget-ka \
locale-wget-ko \
locale-wget-lt \
locale-wget-ms \
locale-wget-nb \
locale-wget-nl \
locale-wget-pl \
locale-wget-pt \
locale-wget-pt-BR \
locale-wget-ro \
locale-wget-ru \
locale-wget-sk \
locale-wget-sl \
locale-wget-sr \
locale-wget-sv \
locale-wget-tr \
locale-wget-uk \
locale-wget-vi \
locale-wget-zh-CN \
locale-wget-zh-TW \
wget-lang \
wget-lang-all"

RDEPENDS:${PN} += "wget"

inherit rpm
