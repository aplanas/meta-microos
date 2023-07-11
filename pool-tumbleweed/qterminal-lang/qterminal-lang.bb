SUMMARY = "Translations for package qterminal"
DESCRIPTION = "Provides translations for the 'qterminal' package."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "qterminal-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "fef10b996643f81210c1eb0fcdce680dc932a041aa7b1c8a6a1ae5320cb56847dd2cdca46b951584c737f5663e966160904ec9f4a7b2fcfb09856f39a4382baa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qterminal-lang \
qterminal-lang-all"

RDEPENDS:${PN} += "qterminal"

inherit rpm
