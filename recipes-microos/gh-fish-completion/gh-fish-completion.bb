SUMMARY = "Fish completion for gh"
DESCRIPTION = "Fish command line completion support for gh."
LICENSE = "MIT"

PV = "2.30.0"

RPM_NAME = "gh-fish-completion-2.30.0-1.1.noarch.rpm"
RPM_HASH = "680c88a10445b7f262e68c6059405954deae74c6e92bbb564b9ecf0f068c835691a3c91968e0f0b1b5dadc93cfe8269ac25be862e3125883f506a60fb5dbb719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-fish-completion"
RDEPENDS:${PN} += "gh"

inherit rpm
