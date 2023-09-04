SUMMARY = "Translations for package libqt5keychain1"
DESCRIPTION = "Provides translations for the 'libqt5keychain1' package."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "libqt5keychain1-lang-0.14.1-1.1.noarch.rpm"
RPM_HASH = "45f849ee5ac876c0552cf72743107ac157d482315f0a05a3982bffd3b328a7d11ac21f315f08ebf8824daa2eacf974ce173205e5bfdc04f5ef2eae9dd41daeba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5keychain1-lang \
libqt5keychain1-lang-all"

RDEPENDS:${PN} += "libqt5keychain1"

inherit rpm
