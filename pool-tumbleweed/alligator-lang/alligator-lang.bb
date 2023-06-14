SUMMARY = "Translations for package alligator"
DESCRIPTION = "Provides translations for the 'alligator' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "alligator-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "dc129a307f5d76e68de6fdda4e7bdd3fee314b5a754597c5f337deeb9ecf7b2fac1b4185201024f7e284fa0a609f3fe77c0f5d4d8177ca40d74352470575c64d"
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
