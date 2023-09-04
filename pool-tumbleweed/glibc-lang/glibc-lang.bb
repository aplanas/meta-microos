SUMMARY = "Translations for package glibc"
DESCRIPTION = "Provides translations for the 'glibc' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0"

PV = "2.38"

RPM_NAME = "glibc-lang-2.38-1.1.noarch.rpm"
RPM_HASH = "009d624a8d4800c131a197aea15b7bd130f4637367901f77b91dea2f32e8c9f050120ad5829f395f1614ff708cf12910ae85a86dc9a689853b5ab42153b2df38"
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
locale-glibc-ro \
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
