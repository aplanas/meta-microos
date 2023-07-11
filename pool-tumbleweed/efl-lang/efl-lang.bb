SUMMARY = "Translations for package efl"
DESCRIPTION = "Provides translations for the 'efl' package."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & Zlib"

PV = "1.26.3"

RPM_NAME = "efl-lang-1.26.3-30.8.noarch.rpm"
RPM_HASH = "36ae1270c86c3098b26afed9f6e48b9bac1e4b4946405009e1d783d63af8fd8dc0dede820195f7a398a67fe8ccfd98ee17469f1857f67c53a096e556c6bcb851"
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
