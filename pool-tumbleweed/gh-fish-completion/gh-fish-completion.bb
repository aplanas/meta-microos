SUMMARY = "Fish completion for gh"
DESCRIPTION = "Fish command line completion support for gh."
LICENSE = "MIT"

PV = "2.31.0"

RPM_NAME = "gh-fish-completion-2.31.0-1.1.noarch.rpm"
RPM_HASH = "ed69f357cbf19ff55a8bd0d2a05790719bc830897950e6c72ee749c073de8a04f0bba4b7732225b60d325cd899ed362f70953931c62d22c90f5ab2e027f10ef6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-fish-completion"

RDEPENDS:${PN} += "gh"

inherit rpm
