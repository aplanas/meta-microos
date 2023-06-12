SUMMARY = "Library for querying the DuckDuckGo API"
DESCRIPTION = "A Python library for querying the DuckDuckGo API."
LICENSE = "BSD-3-Clause"

PV = "0.242"

RPM_NAME = "python311-duckduckgo2-0.242-3.13.noarch.rpm"
RPM_HASH = "64a52231318d4ce6534696a50f6278e2bb978486ab29e48126fef06dea6f946fa22ee20c02f7124f86dd23707895699bdd7efbba213a8eee6a7cd3a8691246e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(duckduckgo2) \
python311-duckduckgo2 \
python3dist(duckduckgo2)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
