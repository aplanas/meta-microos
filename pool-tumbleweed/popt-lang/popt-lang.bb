SUMMARY = "Translations for package popt"
DESCRIPTION = "Provides translations for the 'popt' package."
LICENSE = "MIT"

PV = "1.19"

RPM_NAME = "popt-lang-1.19-1.4.noarch.rpm"
RPM_HASH = "cc887f1ddbc6df31e750b2818958a4e66ccde67a69a6f8b16b7644c7046b9ffac14da154d3e7e044b49be339fa75b6ed08fcdea9b3ef1b19bcc0cf734f0feaf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-popt-ca \
locale-popt-cs \
locale-popt-da \
locale-popt-de \
locale-popt-eo \
locale-popt-es \
locale-popt-fi \
locale-popt-fr \
locale-popt-ga \
locale-popt-gl \
locale-popt-hu \
locale-popt-id \
locale-popt-is \
locale-popt-it \
locale-popt-ja \
locale-popt-ka \
locale-popt-ko \
locale-popt-lv \
locale-popt-nb \
locale-popt-nl \
locale-popt-pl \
locale-popt-pt \
locale-popt-pt-BR \
locale-popt-ro \
locale-popt-ru \
locale-popt-si \
locale-popt-sk \
locale-popt-sl \
locale-popt-sv \
locale-popt-th \
locale-popt-tr \
locale-popt-uk \
locale-popt-vi \
locale-popt-wa \
locale-popt-zh-CN \
locale-popt-zh-TW \
popt-lang \
popt-lang-all"

RDEPENDS:${PN} += "popt"

inherit rpm
