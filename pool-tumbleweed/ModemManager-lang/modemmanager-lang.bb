SUMMARY = "Translations for package ModemManager"
DESCRIPTION = "Provides translations for the 'ModemManager' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.6"

RPM_NAME = "ModemManager-lang-1.20.6-1.1.noarch.rpm"
RPM_HASH = "be5b2d82082d7d1603fc36425bcccf0f6e45223865730b93fa0c4e61c0a1d36a62ea64aac8a11560c0a969aede44caad6e09f06bdd2a6da1bb39db054188b95b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ModemManager-lang \
ModemManager-lang-all \
locale-ModemManager-cs \
locale-ModemManager-da \
locale-ModemManager-de \
locale-ModemManager-fi \
locale-ModemManager-fr \
locale-ModemManager-fur \
locale-ModemManager-gl \
locale-ModemManager-he \
locale-ModemManager-hu \
locale-ModemManager-id \
locale-ModemManager-it \
locale-ModemManager-ka \
locale-ModemManager-lt \
locale-ModemManager-nl \
locale-ModemManager-pl \
locale-ModemManager-pt-BR \
locale-ModemManager-ru \
locale-ModemManager-sk \
locale-ModemManager-sv \
locale-ModemManager-tr \
locale-ModemManager-uk \
locale-ModemManager-zh-CN"

RDEPENDS:${PN} += "ModemManager"

inherit rpm
