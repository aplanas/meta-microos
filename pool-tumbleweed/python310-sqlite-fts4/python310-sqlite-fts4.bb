SUMMARY = "Python functions for working with SQLite FTS4 search"
DESCRIPTION = "Python functions for working with SQLite FTS4 search"
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python310-sqlite-fts4-1.0.3-1.5.noarch.rpm"
RPM_HASH = "5cab323fab9ae9029ed4618718aaf2a4cc0def3fa225d579875b643c2bf32b400735afefa165dfecb9eab64f1227963f8f25387d17d14a088fb877932a8255c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sqlite-fts4 \
python310-sqlite-fts4 \
python3dist-sqlite-fts4"

RDEPENDS:${PN} += "python-abi"

inherit rpm
