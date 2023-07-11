SUMMARY = "Translations for package alligator"
DESCRIPTION = "Provides translations for the 'alligator' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "alligator-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "1ec85aad1c9091ba5ac07cc655d4c5d239137103948e18677073b269f1895ccc2b32cbca7e16521ea67025840744c5871c1f5ccf590b0d33b9ffbe84f50a42a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alligator-lang \
alligator-lang-all \
locale-alligator-ca \
locale-alligator-ca@valencia \
locale-alligator-cs \
locale-alligator-de \
locale-alligator-en-GB \
locale-alligator-es \
locale-alligator-et \
locale-alligator-eu \
locale-alligator-fi \
locale-alligator-fr \
locale-alligator-gl \
locale-alligator-hu \
locale-alligator-ia \
locale-alligator-it \
locale-alligator-ja \
locale-alligator-ka \
locale-alligator-ko \
locale-alligator-lt \
locale-alligator-nl \
locale-alligator-nn \
locale-alligator-pa \
locale-alligator-pl \
locale-alligator-pt \
locale-alligator-pt-BR \
locale-alligator-ru \
locale-alligator-sk \
locale-alligator-sl \
locale-alligator-sv \
locale-alligator-tr \
locale-alligator-uk \
locale-alligator-zh-CN \
locale-alligator-zh-TW"

RDEPENDS:${PN} += "alligator"

inherit rpm
