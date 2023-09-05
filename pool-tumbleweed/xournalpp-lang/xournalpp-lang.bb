SUMMARY = "Translations for package xournalpp"
DESCRIPTION = "Provides translations for the 'xournalpp' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "xournalpp-lang-1.2.1-1.1.noarch.rpm"
RPM_HASH = "908710baf071b879f8c2456711b85cdeff5bcf8ff8f4c4961b3d513a34514a28f3b89b7ecdf7d2daf546e7b85ec6929e0126b35224fdf9e68426d65b22c348a8"
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
locale-xournalpp-uk-UA \
locale-xournalpp-vi \
locale-xournalpp-zh \
locale-xournalpp-zh-HK \
locale-xournalpp-zh-TW \
xournalpp-lang \
xournalpp-lang-all"

RDEPENDS:${PN} += "xournalpp"

inherit rpm
