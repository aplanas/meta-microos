SUMMARY = "Translations for package ModemManager"
DESCRIPTION = "Provides translations for the 'ModemManager' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.6"

RPM_NAME = "ModemManager-lang-1.20.6-1.2.noarch.rpm"
RPM_HASH = "7adfb403d17a594fba26822923ac17f393ceeeb72d8889596e43cd20e4694ab37ec0b2b9d5756f81096e5b3f38a2546a6b91b4bfdb86803457a8d5eb7b1b1917"
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
