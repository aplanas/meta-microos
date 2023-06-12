SUMMARY = "Translations for package focuswriter"
DESCRIPTION = "Provides translations for the 'focuswriter' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.4"

RPM_NAME = "focuswriter-lang-1.8.4-1.3.noarch.rpm"
RPM_HASH = "8f3632fe22c794854732b4a414400433336ec691372bba0969f5fd221145fc281e67395e87042b203ce980406234cc980a3c6440e626ac5e8fbec9917075c9d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "focuswriter-lang \
focuswriter-lang-all"
RDEPENDS:${PN} += "focuswriter"

inherit rpm
