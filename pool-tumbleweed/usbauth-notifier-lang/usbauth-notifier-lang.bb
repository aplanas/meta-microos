SUMMARY = "Translations for package usbauth-notifier"
DESCRIPTION = "Provides translations for the 'usbauth-notifier' package."
LICENSE = "GPL-2.0-only"

PV = "1.0.4"

RPM_NAME = "usbauth-notifier-lang-1.0.4-1.6.noarch.rpm"
RPM_HASH = "b92f532fbda74b7ac106622b400ab0e001074041ad8b86e2cb7e872fb5265d6e8677f3fcafed70d2ce7a3e2e9bee3bb13eebaaa1b62a8d26242da47f69390f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(usbauth-notifier:de) \
locale(usbauth-notifier:zh_TW) \
usbauth-notifier-lang \
usbauth-notifier-lang-all"

RDEPENDS:${PN} += "usbauth-notifier"

inherit rpm
