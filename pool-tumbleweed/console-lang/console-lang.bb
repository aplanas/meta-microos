SUMMARY = "Translations for package console"
DESCRIPTION = "Provides translations for the 'console' package."
LICENSE = "GPL-3.0-only"

PV = "44.4"

RPM_NAME = "console-lang-44.4-1.1.noarch.rpm"
RPM_HASH = "d4114f8270ba1ec5e56d752bf8c2199731bcce20adde85c44e5fbe3665dd53f341110c94b17af056ea0e79a5f57a6783c40e7c4bce8cc165fdc3b10b514aea81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "console-lang \
console-lang-all \
locale-console-be \
locale-console-bg \
locale-console-ca \
locale-console-cs \
locale-console-da \
locale-console-de \
locale-console-el \
locale-console-en-GB \
locale-console-es \
locale-console-eu \
locale-console-fa \
locale-console-fi \
locale-console-fr \
locale-console-fur \
locale-console-gl \
locale-console-he \
locale-console-hi \
locale-console-hr \
locale-console-hu \
locale-console-id \
locale-console-it \
locale-console-ja \
locale-console-ka \
locale-console-kk \
locale-console-ko \
locale-console-lt \
locale-console-lv \
locale-console-nb \
locale-console-ne \
locale-console-nl \
locale-console-oc \
locale-console-pa \
locale-console-pl \
locale-console-pt \
locale-console-pt-BR \
locale-console-ro \
locale-console-ru \
locale-console-sk \
locale-console-sl \
locale-console-sr \
locale-console-sv \
locale-console-tr \
locale-console-uk \
locale-console-vi \
locale-console-zh-CN \
locale-console-zh-TW"

RDEPENDS:${PN} += "console"

inherit rpm
