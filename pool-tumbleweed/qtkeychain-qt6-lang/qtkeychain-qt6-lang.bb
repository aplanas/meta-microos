SUMMARY = "Translations for package qtkeychain-qt6"
DESCRIPTION = "Provides translations for the 'qtkeychain-qt6' package."
LICENSE = "BSD-2-Clause"

PV = "0.13.2"

RPM_NAME = "qtkeychain-qt6-lang-0.13.2-4.2.noarch.rpm"
RPM_HASH = "9fde411db2cd2059518db40fe0066e9f2b0793f12b0fe3725f41c722e7fd2bfc5f172a4f17dc54abe2ddfa538193127772a9cf8c0efd2ec7b27cf5d601833c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qtkeychain-qt6-lang \
qtkeychain-qt6-lang-all"

RDEPENDS:${PN} += "libqt6keychain1"

inherit rpm
