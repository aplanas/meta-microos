SUMMARY = "Translations for package xournalpp"
DESCRIPTION = "Provides translations for the 'xournalpp' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "xournalpp-lang-1.2.0-1.1.noarch.rpm"
RPM_HASH = "578ee5e31b9b68cada344cb31a0f3847837c89e3484496c9efab16c5b733ab00565800b83033b0c56bcf57fd0ba84f039fd1563fb1b280d441b8661d0d801b8f"
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
