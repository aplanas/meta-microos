SUMMARY = "A case-insensitive ordered dictionary for Python"
DESCRIPTION = "Class `NocaseDict`_ is a case-insensitive ordered dictionary that preserves \
the original lexical case of its keys."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "python311-nocasedict-1.0.4-1.3.noarch.rpm"
RPM_HASH = "be684b797e73b37e95441710f1f4cdaa95d9e8351cf3a773df8ecd27ae23e17b573ac3ecd9f1fbb0dd0531d1704312828b60f797d03d7eae9cc159a7214867b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nocasedict) \
python311-nocasedict \
python3dist(nocasedict)"

RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
