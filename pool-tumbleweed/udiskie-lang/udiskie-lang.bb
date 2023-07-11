SUMMARY = "Translations for package udiskie"
DESCRIPTION = "Provides translations for the 'udiskie' package."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "udiskie-lang-2.4.2-1.7.noarch.rpm"
RPM_HASH = "0bfc4f85abf310c4f08df24f45b726f3547defb0e0eb56348b99cdc5dba12e38667c6231936ed903d6221d0d215368f345a25e85ea4c5365786adb4b0119e53a"
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
