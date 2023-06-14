SUMMARY = "Translations for package udiskie"
DESCRIPTION = "Provides translations for the 'udiskie' package."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "udiskie-lang-2.4.2-1.6.noarch.rpm"
RPM_HASH = "a84ebe76a4b319d4deac828aaa76f29581b343e447350e23be1df24252601d911103dc610c10f4f927589da8d97cd61853d9436d3c06dee18ffe948ee4f8fa05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-udiskie-en-US \
locale-udiskie-es-ES \
locale-udiskie-it-IT \
locale-udiskie-ru-RU \
locale-udiskie-tr-TR \
udiskie-lang \
udiskie-lang-all"

RDEPENDS:${PN} += "udiskie"

inherit rpm
