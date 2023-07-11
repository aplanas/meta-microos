SUMMARY = "Translations for package usbauth-notifier"
DESCRIPTION = "Provides translations for the 'usbauth-notifier' package."
LICENSE = "GPL-2.0-only"

PV = "1.0.4"

RPM_NAME = "usbauth-notifier-lang-1.0.4-1.7.noarch.rpm"
RPM_HASH = "622dbed6ad388f5ea16b7152e13c7cabeae7ee6e5882b43a4c0445f0c6d123b0a3ccc643983663e9d8a9f9d65dd32a92e920715b7481922674596f9cf7cb8de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-usbauth-notifier-de \
locale-usbauth-notifier-zh-TW \
usbauth-notifier-lang \
usbauth-notifier-lang-all"

RDEPENDS:${PN} += "usbauth-notifier"

inherit rpm
