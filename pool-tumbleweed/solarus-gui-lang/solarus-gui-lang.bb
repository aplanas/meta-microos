SUMMARY = "Translations for package solarus-gui"
DESCRIPTION = "Provides translations for the 'solarus-gui' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "solarus-gui-lang-1.6.5-2.16.noarch.rpm"
RPM_HASH = "ca814ae62434d4e19512c3f85b49254d18b1f1c9f266e498a2619b761a50f4b10cb6c5dd58a4c62e1120eab1ceb5cde6a5b98b49fd4299e747305a8cc0bc1ed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "solarus-gui-lang \
solarus-gui-lang-all"

RDEPENDS:${PN} += "solarus-gui"

inherit rpm
