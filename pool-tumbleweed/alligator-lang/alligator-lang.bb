SUMMARY = "Translations for package alligator"
DESCRIPTION = "Provides translations for the 'alligator' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "alligator-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "a971e397929a2ac5b4b808a8f277bcb698ba85f800c72e43bba1d5487155b906be0dc03cf7bacb9d8f8841715fa440ab1f46320eccee002d0dc73caae90d055d"
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
