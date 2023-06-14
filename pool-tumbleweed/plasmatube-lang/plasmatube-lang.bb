SUMMARY = "Translations for package plasmatube"
DESCRIPTION = "Provides translations for the 'plasmatube' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "plasmatube-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "059d343b0916590e13301eae5552bc7fd9a9a26c097998ffd87de449d3227c5a00e77f9e61be499b12c26abaea50ddbda7e312beadc200239f62fe718d7e5a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasmatube-ar \
locale-plasmatube-az \
locale-plasmatube-be \
locale-plasmatube-ca \
locale-plasmatube-ca@valencia \
locale-plasmatube-cs \
locale-plasmatube-de \
locale-plasmatube-en-GB \
locale-plasmatube-es \
locale-plasmatube-eu \
locale-plasmatube-fi \
locale-plasmatube-fr \
locale-plasmatube-hi \
locale-plasmatube-hu \
locale-plasmatube-ia \
locale-plasmatube-id \
locale-plasmatube-it \
locale-plasmatube-ja \
locale-plasmatube-ka \
locale-plasmatube-ko \
locale-plasmatube-lt \
locale-plasmatube-nl \
locale-plasmatube-nn \
locale-plasmatube-pa \
locale-plasmatube-pl \
locale-plasmatube-pt \
locale-plasmatube-pt-BR \
locale-plasmatube-ru \
locale-plasmatube-sk \
locale-plasmatube-sl \
locale-plasmatube-sv \
locale-plasmatube-tr \
locale-plasmatube-uk \
locale-plasmatube-zh-CN \
locale-plasmatube-zh-TW \
plasmatube-lang \
plasmatube-lang-all"

RDEPENDS:${PN} += "plasmatube"

inherit rpm
