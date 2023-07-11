SUMMARY = "Translations for package focuswriter"
DESCRIPTION = "Provides translations for the 'focuswriter' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.5"

RPM_NAME = "focuswriter-lang-1.8.5-1.1.noarch.rpm"
RPM_HASH = "ff8d3471b47950589031b7fce8b50f3dbe7b5b7e54ca5396432e6988f922e3eb0a842683bec800d06ead6789e591e86058e92ac65d9ade8a3c1e6d6072d03780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "focuswriter-lang \
focuswriter-lang-all"

RDEPENDS:${PN} += "focuswriter"

inherit rpm
