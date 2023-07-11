SUMMARY = "A spellchecker with grouping support"
DESCRIPTION = "mwic is a spell-checker that groups possible misspellings and shows \
them in their contexts. This is useful for checking technical \
documents that often contain words that are not included in standard \
dictionaries."
LICENSE = "MIT"

PV = "0.7.9"

RPM_NAME = "mwic-0.7.9-1.3.noarch.rpm"
RPM_HASH = "b30183bf001fb4a7bfaaba848a13ac0653f87056d1562b41db376085721ac5dcf0d7e5ce74d683959645487cb16a339444a5cfcb4586000609a5b4d642199ea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mwic"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-pyenchant \
python3-regex"

inherit rpm
