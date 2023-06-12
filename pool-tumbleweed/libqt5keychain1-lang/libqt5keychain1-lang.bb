SUMMARY = "Translations for package libqt5keychain1"
DESCRIPTION = "Provides translations for the 'libqt5keychain1' package."
LICENSE = "BSD-2-Clause"

PV = "0.13.2"

RPM_NAME = "libqt5keychain1-lang-0.13.2-4.1.noarch.rpm"
RPM_HASH = "28fc9d674fc15ee01ab28ba11d43e0a153deb292cf435cfd0a1652aff6fdb1dd4df54b6d017066d51a6c245190108aa99567d4ba025ad261cf5b974f5d4d218c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5keychain1-lang \
libqt5keychain1-lang-all"
RDEPENDS:${PN} += "libqt5keychain1"

inherit rpm
