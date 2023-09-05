SUMMARY = "Translations for package celluloid"
DESCRIPTION = "Provides translations for the 'celluloid' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.25"

RPM_NAME = "celluloid-lang-0.25-2.1.noarch.rpm"
RPM_HASH = "675502e8e185298e1e5b3498827ae18179c2a4a68e5988ac38ec37e3423e28b0e8ef1eba59c867422c50e015650289f68fbf0febe52f3dfd085ca03a8b7ae861"
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
