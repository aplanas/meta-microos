SUMMARY = "Translations for package liblxqt"
DESCRIPTION = "Provides translations for the 'liblxqt' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "liblxqt-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "33e57c90e8908372f893fb951a9686a6261568d622909fe760abd52b3cfe16df9ae516785dfec53e91dc6a7414e180be74e794af5c0545a98f52d64b5d32fef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblxqt-lang \
liblxqt-lang-all"

RDEPENDS:${PN} += "liblxqt"

inherit rpm
