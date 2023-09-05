SUMMARY = "Translations for package spectacle"
DESCRIPTION = "Provides translations for the 'spectacle' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "spectacle-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "18dd7c41cc96e9b135c0c9f4b14076f97ef6adbf64a280858d1bbd2e49a43b895762da3a8b1945fdc3392d8c755a064bd8ac36b27273859ea47e1e91a007bef6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-spectacle-ar \
locale-spectacle-az \
locale-spectacle-bg \
locale-spectacle-ca \
locale-spectacle-ca@valencia \
locale-spectacle-cs \
locale-spectacle-da \
locale-spectacle-de \
locale-spectacle-el \
locale-spectacle-en-GB \
locale-spectacle-eo \
locale-spectacle-es \
locale-spectacle-et \
locale-spectacle-eu \
locale-spectacle-fi \
locale-spectacle-fr \
locale-spectacle-gl \
locale-spectacle-he \
locale-spectacle-hu \
locale-spectacle-ia \
locale-spectacle-id \
locale-spectacle-is \
locale-spectacle-it \
locale-spectacle-ja \
locale-spectacle-ka \
locale-spectacle-ko \
locale-spectacle-lt \
locale-spectacle-ml \
locale-spectacle-nl \
locale-spectacle-nn \
locale-spectacle-pa \
locale-spectacle-pl \
locale-spectacle-pt \
locale-spectacle-pt-BR \
locale-spectacle-ro \
locale-spectacle-ru \
locale-spectacle-sk \
locale-spectacle-sl \
locale-spectacle-sr \
locale-spectacle-sr@ijekavian \
locale-spectacle-sr@ijekavianlatin \
locale-spectacle-sr@latin \
locale-spectacle-sv \
locale-spectacle-ta \
locale-spectacle-tr \
locale-spectacle-uk \
locale-spectacle-zh-CN \
locale-spectacle-zh-TW \
spectacle-lang \
spectacle-lang-all"

RDEPENDS:${PN} += "spectacle"

inherit rpm
