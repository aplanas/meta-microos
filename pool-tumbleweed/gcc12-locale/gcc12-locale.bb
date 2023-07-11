SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-locale-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "169292799a00513152ddfb0c4316580d7e0df009ac69eefc4e451efabc282df04dad19b5414cdc7716d918f370bd21c46a3a3e613d26d5d1f22da068cfd0d725"

RPROVIDES:${PN} += "gcc12-locale \
locale-gcc12-be \
locale-gcc12-ca \
locale-gcc12-da \
locale-gcc12-de \
locale-gcc12-el \
locale-gcc12-eo \
locale-gcc12-es \
locale-gcc12-fi \
locale-gcc12-fr \
locale-gcc12-hr \
locale-gcc12-id \
locale-gcc12-ja \
locale-gcc12-ka \
locale-gcc12-nl \
locale-gcc12-pt-BR \
locale-gcc12-ro \
locale-gcc12-ru \
locale-gcc12-sr \
locale-gcc12-sv \
locale-gcc12-tr \
locale-gcc12-uk \
locale-gcc12-vi \
locale-gcc12-zh-CN \
locale-gcc12-zh-TW"

RDEPENDS:${PN} += "gcc12"

inherit rpm
