SUMMARY = "Translations for package efl"
DESCRIPTION = "Provides translations for the 'efl' package."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & Zlib"

PV = "1.26.3"

RPM_NAME = "efl-lang-1.26.3-30.6.noarch.rpm"
RPM_HASH = "8d23c049ef90351463fe8fc5fdd9ddd2b6bea619ccd4efd4fa90783596e50d579537dc7eb92cf72741e0ed038e4bbc5a5d3dacec7241d051ea670af2a9b8a64c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "efl-lang \
efl-lang-all \
locale-efl-ar \
locale-efl-ca \
locale-efl-cs \
locale-efl-da \
locale-efl-de \
locale-efl-el \
locale-efl-eo \
locale-efl-es \
locale-efl-fa \
locale-efl-fi \
locale-efl-fr \
locale-efl-gl \
locale-efl-he \
locale-efl-hu \
locale-efl-it \
locale-efl-ja \
locale-efl-ko \
locale-efl-lt \
locale-efl-nl \
locale-efl-pl \
locale-efl-pt \
locale-efl-ru \
locale-efl-sl \
locale-efl-sr \
locale-efl-tr \
locale-efl-vi \
locale-efl-zh-CN"

RDEPENDS:${PN} += "efl"

inherit rpm
