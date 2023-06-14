SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-locale-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "addc13277764d16b55f89a5f2e6ac7f473eeb6d35906a92f74de31480e6142abd8c818ab92ef11d495535abdbf789d451e12d47f234d1b064ede8418b86c51db"

RPROVIDES:${PN} += "gcc7-locale \
locale-gcc7-be \
locale-gcc7-ca \
locale-gcc7-da \
locale-gcc7-de \
locale-gcc7-el \
locale-gcc7-eo \
locale-gcc7-es \
locale-gcc7-fi \
locale-gcc7-fr \
locale-gcc7-hr \
locale-gcc7-id \
locale-gcc7-ja \
locale-gcc7-nl \
locale-gcc7-pt-BR \
locale-gcc7-ru \
locale-gcc7-sr \
locale-gcc7-sv \
locale-gcc7-tr \
locale-gcc7-uk \
locale-gcc7-vi \
locale-gcc7-zh-CN \
locale-gcc7-zh-TW"

RDEPENDS:${PN} += "gcc7"

inherit rpm
