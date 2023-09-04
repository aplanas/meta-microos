SUMMARY = "Translations for package keepassxc"
DESCRIPTION = "Provides translations for the 'keepassxc' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.7.6"

RPM_NAME = "keepassxc-lang-2.7.6-1.1.noarch.rpm"
RPM_HASH = "2ee769e69989905ac8058c513b7b53e7fbdbb7e1dcd0d43131c50faf990949351d91562d1278df7f0656ac4b45ff664a92c453f3285f676ce3f63de55fef49cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keepassxc-lang \
keepassxc-lang-all"

RDEPENDS:${PN} += "keepassxc"

inherit rpm
