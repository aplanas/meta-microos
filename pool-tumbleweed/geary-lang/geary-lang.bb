SUMMARY = "Translations for package geary"
DESCRIPTION = "Provides translations for the 'geary' package."
LICENSE = "BSD-2-Clause & CC-BY-3.0 & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "geary-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "4e2693702cb801b37a7b6d52bb968b0e867f90cb91df862662ee4b738a5f89249afa859919ae2c43f4bb4f7926e49174dfa32634508416ddc267f38408e7ded7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geary-lang \
geary-lang-all \
locale-geary-ar \
locale-geary-be \
locale-geary-bs \
locale-geary-ca \
locale-geary-cs \
locale-geary-da \
locale-geary-de \
locale-geary-el \
locale-geary-en-CA \
locale-geary-en-GB \
locale-geary-eo \
locale-geary-es \
locale-geary-et \
locale-geary-eu \
locale-geary-fa \
locale-geary-fi \
locale-geary-fr \
locale-geary-fur \
locale-geary-gl \
locale-geary-he \
locale-geary-hi \
locale-geary-hr \
locale-geary-hu \
locale-geary-id \
locale-geary-it \
locale-geary-ja \
locale-geary-kk \
locale-geary-km \
locale-geary-lt \
locale-geary-ms \
locale-geary-nb \
locale-geary-nl \
locale-geary-oc \
locale-geary-pl \
locale-geary-pt \
locale-geary-pt-BR \
locale-geary-ro \
locale-geary-ru \
locale-geary-sk \
locale-geary-sl \
locale-geary-sr \
locale-geary-sr@latin \
locale-geary-sv \
locale-geary-te \
locale-geary-tr \
locale-geary-uk \
locale-geary-vi \
locale-geary-zh-CN \
locale-geary-zh-TW"

RDEPENDS:${PN} += "geary"

inherit rpm
