SUMMARY = "A pure Python Levenshtein implementation"
DESCRIPTION = "A pure Python Levenshtein implementation."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python311-pylev-1.4.0-2.1.noarch.rpm"
RPM_HASH = "87ef32ad48e41a5d141e3ef3ccef624ef62e9d6de3c47b0630761b28a406b76cb2a13cfa5b29d917075b0fcdce9f0387f43426dfc1ad6ff250d66fff93e8eeaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pylev) \
python311-pylev \
python3dist(pylev)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
