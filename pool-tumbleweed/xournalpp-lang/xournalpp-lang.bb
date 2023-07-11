SUMMARY = "Translations for package xournalpp"
DESCRIPTION = "Provides translations for the 'xournalpp' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.3"

RPM_NAME = "xournalpp-lang-1.1.3-2.2.noarch.rpm"
RPM_HASH = "113bf3703c876e95320ba1005ec5962cd2e76cb99cb8849b0eb7fba8222f5b9e837c751c7be29918fdc2edd0be62e550f31d723a1a01f92a5ded8f1ee1c59988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xournalpp-ar \
locale-xournalpp-ca \
locale-xournalpp-cs \
locale-xournalpp-da \
locale-xournalpp-de \
locale-xournalpp-el \
locale-xournalpp-es \
locale-xournalpp-eu \
locale-xournalpp-fi \
locale-xournalpp-fr \
locale-xournalpp-gl \
locale-xournalpp-he \
locale-xournalpp-hi \
locale-xournalpp-hu \
locale-xournalpp-id \
locale-xournalpp-it \
locale-xournalpp-ja \
locale-xournalpp-ko \
locale-xournalpp-nl \
locale-xournalpp-pl \
locale-xournalpp-pt-BR \
locale-xournalpp-pt-PT \
locale-xournalpp-ro \
locale-xournalpp-ru \
locale-xournalpp-sv \
locale-xournalpp-th \
locale-xournalpp-tr \
locale-xournalpp-vi \
locale-xournalpp-zh \
locale-xournalpp-zh-HK \
locale-xournalpp-zh-TW \
xournalpp-lang \
xournalpp-lang-all"

RDEPENDS:${PN} += "xournalpp"

inherit rpm
