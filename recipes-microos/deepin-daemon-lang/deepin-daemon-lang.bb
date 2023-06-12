SUMMARY = "Translations for package deepin-daemon"
DESCRIPTION = "Provides translations for the 'deepin-daemon' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-lang-5.14.45-2.4.aarch64.rpm"
RPM_HASH = "9dbd0b86218b9247111332952b87d7260e78c5128ed931c38f34619cacd23e4e455023e1266799205cd768f6b70e4603857b15a3a3b62c975014f7e66e040309"

RPROVIDES:${PN} += "deepin-daemon-lang \
deepin-daemon-lang(aarch-64)"
RDEPENDS:${PN} += "deepin-daemon"

inherit rpm
