SUMMARY = "Translations for package deepin-reader"
DESCRIPTION = "Provides translations for the 'deepin-reader' package."
LICENSE = "GPL-3.0+"

PV = "5.10.23"

RPM_NAME = "deepin-reader-lang-5.10.23-1.4.noarch.rpm"
RPM_HASH = "fd28176b957eb1601c6bdb6216c4f67441adfdb78d39115bec5bd487eb9a4ca86995876ae54d21943d82f8fcecc3c1cc3e2d4f8a5d68151a7a414977f721901f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-reader-lang deepin-reader-lang-all"
RDEPENDS:${PN} += "deepin-reader"

inherit rpm
