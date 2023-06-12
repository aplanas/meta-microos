SUMMARY = "A pure Python Levenshtein implementation"
DESCRIPTION = "A pure Python Levenshtein implementation."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python310-pylev-1.4.0-2.1.noarch.rpm"
RPM_HASH = "c28e070f16c6627bf0a6380e639b27347f3ebd799a5bb1e123c6ff9521b9ba52690ec21c7f3f1ad40171c8e1da7aab53def15dcac94d8cb520f42b3f19411274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylev \
python3.10dist(pylev) \
python310-pylev \
python3dist(pylev)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
