SUMMARY = "Fish completion for highlight"
DESCRIPTION = "This package provides Fish command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.8"

RPM_NAME = "highlight-fish-completion-4.8-1.1.noarch.rpm"
RPM_HASH = "bb1936861a0c1366e817fbd26cf0f3cc59d0689557ec7e33f6df30a2dd31e2d53c5c305e8861bb753c9f92250b2c853d9328853b8b6752647f680616509486c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-fish-completion"

RDEPENDS:${PN} += "fish \
highlight"

inherit rpm
