SUMMARY = "Translations for package qtkeychain-qt6"
DESCRIPTION = "Provides translations for the 'qtkeychain-qt6' package."
LICENSE = "BSD-2-Clause"

PV = "0.13.2"

RPM_NAME = "qtkeychain-qt6-lang-0.13.2-4.1.noarch.rpm"
RPM_HASH = "fb46425e1a0cca4a63d84df87e7ccee8c92384b8d81bacf2986fc222b111bd5af99850f6c137f9abf5636e6a4b365ae9a7f947691c46cd13ca5f4afa25a1901a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qtkeychain-qt6-lang \
qtkeychain-qt6-lang-all"

RDEPENDS:${PN} += "libqt6keychain1"

inherit rpm
