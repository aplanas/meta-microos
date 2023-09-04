SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-locale-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "2c27372581fa5caa678e30a1137798cc926e4a60173d3492b01bbce27f05d06761fde4df15cbc1054b9ac4cd67461d8c0cacd29c6e716f8ef58e612070e167af"

RPROVIDES:${PN} += "gcc13-locale \
locale-gcc13-be \
locale-gcc13-ca \
locale-gcc13-da \
locale-gcc13-de \
locale-gcc13-el \
locale-gcc13-eo \
locale-gcc13-es \
locale-gcc13-fi \
locale-gcc13-fr \
locale-gcc13-hr \
locale-gcc13-id \
locale-gcc13-ja \
locale-gcc13-ka \
locale-gcc13-nl \
locale-gcc13-pt-BR \
locale-gcc13-ro \
locale-gcc13-ru \
locale-gcc13-sr \
locale-gcc13-sv \
locale-gcc13-tr \
locale-gcc13-uk \
locale-gcc13-vi \
locale-gcc13-zh-CN \
locale-gcc13-zh-TW"

RDEPENDS:${PN} += "gcc13"

inherit rpm
