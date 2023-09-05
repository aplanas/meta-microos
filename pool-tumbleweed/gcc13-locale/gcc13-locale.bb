SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-locale-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "e64a5d9081e8861e2aee329010dc3c3696286adcbb1f501c48f176691740ef116c834cabd07f4537bc3d4927e263e7fa2c9c3a09c1c1cefd153bcec668631862"

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
