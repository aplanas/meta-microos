SUMMARY = "Translations for package glibc"
DESCRIPTION = "Provides translations for the 'glibc' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0"

PV = "2.37"

RPM_NAME = "glibc-lang-2.37-5.1.noarch.rpm"
RPM_HASH = "a975225da72920ef7c2f7d89b310cd275068508136f8881637171c661233148ae885d1278c9ab75081985b1b7bc9b809cfa6baf02264ce3d7e9defd8638a5d2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-lang \
glibc-lang-all \
locale-glibc-be \
locale-glibc-bg \
locale-glibc-ca \
locale-glibc-cs \
locale-glibc-da \
locale-glibc-de \
locale-glibc-el \
locale-glibc-en-GB \
locale-glibc-eo \
locale-glibc-es \
locale-glibc-fi \
locale-glibc-fr \
locale-glibc-gl \
locale-glibc-hr \
locale-glibc-hu \
locale-glibc-ia \
locale-glibc-id \
locale-glibc-it \
locale-glibc-ja \
locale-glibc-ka \
locale-glibc-ko \
locale-glibc-lt \
locale-glibc-nb \
locale-glibc-nl \
locale-glibc-pl \
locale-glibc-pt \
locale-glibc-pt-BR \
locale-glibc-ru \
locale-glibc-sk \
locale-glibc-sl \
locale-glibc-sr \
locale-glibc-sv \
locale-glibc-tr \
locale-glibc-uk \
locale-glibc-vi \
locale-glibc-zh-CN \
locale-glibc-zh-TW"

RDEPENDS:${PN} += "glibc"

inherit rpm
