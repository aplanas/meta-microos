SUMMARY = "Translations for package budgie-extras"
DESCRIPTION = "Provides translations for the 'budgie-extras' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-extras-lang-1.6.0-1.2.noarch.rpm"
RPM_HASH = "f14820c32dc687722d846d8342c89822c0ed89b285ef626ed1da18d079d638c781fe39b10a1120548074173ce7becdbc96c16c013bedf38767a114ceebe1a10d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-extras-lang \
budgie-extras-lang-all \
locale-budgie-extras-ca \
locale-budgie-extras-de-DE \
locale-budgie-extras-en-GB \
locale-budgie-extras-es \
locale-budgie-extras-fr \
locale-budgie-extras-he \
locale-budgie-extras-it \
locale-budgie-extras-ja \
locale-budgie-extras-lt \
locale-budgie-extras-oc \
locale-budgie-extras-pl \
locale-budgie-extras-pt-BR \
locale-budgie-extras-pt-PT \
locale-budgie-extras-ru \
locale-budgie-extras-sq \
locale-budgie-extras-tr \
locale-budgie-extras-zh-CN"

RDEPENDS:${PN} += "budgie-extras"

inherit rpm
