SUMMARY = "Python functions for working with SQLite FTS4 search"
DESCRIPTION = "Python functions for working with SQLite FTS4 search"
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python310-sqlite-fts4-1.0.3-1.3.noarch.rpm"
RPM_HASH = "2ee615fbec00eb75ec2f9c8b65aa5f88d21f2ffab012a77aeb191dd5f1d2febb5f6e6c2436ca8a11144b2b0207d6fe16cf102006ab6a230c56dd020285cd580f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlite-fts4 \
python3.10dist(sqlite-fts4) \
python310-sqlite-fts4 \
python3dist(sqlite-fts4)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
