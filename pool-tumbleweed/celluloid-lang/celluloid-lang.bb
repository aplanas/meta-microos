SUMMARY = "Translations for package celluloid"
DESCRIPTION = "Provides translations for the 'celluloid' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.25"

RPM_NAME = "celluloid-lang-0.25-1.2.noarch.rpm"
RPM_HASH = "c0519950b1b587203a8b9e7e6b962c6c1d5ace9f8c59bfb7dffa199bc3ee388f255cb4ac0dbfcc66b55e46a96c0029286fba0d12691c8d116266709119279f41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "celluloid-lang \
celluloid-lang-all \
locale-celluloid-ar \
locale-celluloid-bg \
locale-celluloid-ca \
locale-celluloid-cs \
locale-celluloid-da \
locale-celluloid-de \
locale-celluloid-el \
locale-celluloid-eo \
locale-celluloid-es \
locale-celluloid-et \
locale-celluloid-eu \
locale-celluloid-fa \
locale-celluloid-fi \
locale-celluloid-fr \
locale-celluloid-hr \
locale-celluloid-hu \
locale-celluloid-id \
locale-celluloid-is \
locale-celluloid-it \
locale-celluloid-ja \
locale-celluloid-ka \
locale-celluloid-ko \
locale-celluloid-lt \
locale-celluloid-ms \
locale-celluloid-nb-NO \
locale-celluloid-nl \
locale-celluloid-oc \
locale-celluloid-pl \
locale-celluloid-pt-BR \
locale-celluloid-pt-PT \
locale-celluloid-ro \
locale-celluloid-ru \
locale-celluloid-sk \
locale-celluloid-sl \
locale-celluloid-sr \
locale-celluloid-sr@latin \
locale-celluloid-sv \
locale-celluloid-ta \
locale-celluloid-te \
locale-celluloid-tr \
locale-celluloid-uk \
locale-celluloid-zh-CN \
locale-celluloid-zh-TW"

RDEPENDS:${PN} += "celluloid"

inherit rpm
