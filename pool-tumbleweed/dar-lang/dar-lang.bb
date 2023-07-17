SUMMARY = "Translations for package dar"
DESCRIPTION = "Provides translations for the 'dar' package."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.7.10"

RPM_NAME = "dar-lang-2.7.10-1.1.noarch.rpm"
RPM_HASH = "3975c9207652f516bdbeb08d8bc986863ef55955f9fba0dde8900bf71e99614368647210959d04a45d1b90a16474b3adb10c6ae73ecb974c1fc02386f6445e91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dar-lang \
dar-lang-all \
locale-dar-fr \
locale-dar-sv"

RDEPENDS:${PN} += "dar"

inherit rpm
