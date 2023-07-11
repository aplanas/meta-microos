SUMMARY = "Translations for package proftpd"
DESCRIPTION = "Provides translations for the 'proftpd' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-lang-1.3.7f-1.4.noarch.rpm"
RPM_HASH = "185d72a83d6ce4220c76201258e9c3c9afd7fdd3a79b23e83626aa9cbbcbea50cf191e4907391f92b687bd9de749dafa07b8e85ec8bc823cfccbdfda9aa3e6a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-proftpd-en-US \
locale-proftpd-es-ES \
locale-proftpd-fr-FR \
locale-proftpd-it-IT \
locale-proftpd-ru-RU \
locale-proftpd-zh-CN \
locale-proftpd-zh-TW \
proftpd-lang \
proftpd-lang-all"

RDEPENDS:${PN} += "proftpd"

inherit rpm
