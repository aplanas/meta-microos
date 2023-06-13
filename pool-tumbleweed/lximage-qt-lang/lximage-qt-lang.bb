SUMMARY = "Translations for package lximage-qt"
DESCRIPTION = "Provides translations for the 'lximage-qt' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "lximage-qt-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "c8f281562b5100e671a71a1834815653225281aca96ec01524876e2749365a6efadf4954bc05fbbb3157dd9caccf764b77f5fd41328e05cf57c26f2df3cb0dd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lximage-qt-lang \
lximage-qt-lang-all"

RDEPENDS:${PN} += "lximage-qt"

inherit rpm
