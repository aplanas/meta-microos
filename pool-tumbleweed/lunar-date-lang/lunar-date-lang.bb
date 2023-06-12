SUMMARY = "Translations for package lunar-date"
DESCRIPTION = "Provides translations for the 'lunar-date' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "lunar-date-lang-2.9.3-2.14.noarch.rpm"
RPM_HASH = "5a42c0445147e4e43ea7d0e3dccaa07f66ade6cc746de254b581e9b4a9f918405bb6e5a7bebe9352e3dfe23349ebb82a380e820426630999c13f28f351a43694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(lunar-date:zh_CN) \
locale(lunar-date:zh_HK) \
locale(lunar-date:zh_TW) \
lunar-date-lang \
lunar-date-lang-all"
RDEPENDS:${PN} += "lunar-date"

inherit rpm
