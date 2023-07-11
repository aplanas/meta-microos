SUMMARY = "Translations for package sysprof"
DESCRIPTION = "Provides translations for the 'sysprof' package."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-lang-3.48.0-2.2.noarch.rpm"
RPM_HASH = "f3627a7790048d9b1a33739b0f2ef139bb5b07cb6524f30d1daa21326fc532d1babdf8a4b82472e680085137ce6a061cedda4a842bd8da5b793b599b878072e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-sysprof-ca \
locale-sysprof-cs \
locale-sysprof-da \
locale-sysprof-de \
locale-sysprof-el \
locale-sysprof-es \
locale-sysprof-eu \
locale-sysprof-fi \
locale-sysprof-fr \
locale-sysprof-fur \
locale-sysprof-gl \
locale-sysprof-he \
locale-sysprof-hu \
locale-sysprof-id \
locale-sysprof-it \
locale-sysprof-ka \
locale-sysprof-ko \
locale-sysprof-nl \
locale-sysprof-pl \
locale-sysprof-pt \
locale-sysprof-pt-BR \
locale-sysprof-ro \
locale-sysprof-ru \
locale-sysprof-sk \
locale-sysprof-sl \
locale-sysprof-sr \
locale-sysprof-sv \
locale-sysprof-uk \
locale-sysprof-zh-CN \
sysprof-lang \
sysprof-lang-all"

RDEPENDS:${PN} += "sysprof"

inherit rpm
