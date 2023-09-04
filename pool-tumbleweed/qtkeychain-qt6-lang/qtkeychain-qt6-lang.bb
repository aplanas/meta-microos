SUMMARY = "Translations for package qtkeychain-qt6"
DESCRIPTION = "Provides translations for the 'qtkeychain-qt6' package."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "qtkeychain-qt6-lang-0.14.1-1.1.noarch.rpm"
RPM_HASH = "624c95055e5505c2ac2ac3f5a04e213efeb57a7e46501a9fb824c8ed665bd64667eaef41d7676b0a3a6cf37a0f3bb749d0b16ee3d68bef7887a36c1d21265020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qtkeychain-qt6-lang \
qtkeychain-qt6-lang-all"

RDEPENDS:${PN} += "libqt6keychain1"

inherit rpm
