SUMMARY = "Python functions for working with SQLite FTS4 search"
DESCRIPTION = "Python functions for working with SQLite FTS4 search"
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python311-sqlite-fts4-1.0.3-1.5.noarch.rpm"
RPM_HASH = "8749cd3aadcda75ba63233633508a73a0eca681ea1608d55454474bf69710463decf905423827bec3af1a56e9911ca10a4e6d84eb51f9540293bfdd79db30e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlite-fts4 \
python3.11dist-sqlite-fts4 \
python311-sqlite-fts4 \
python3dist-sqlite-fts4"

RDEPENDS:${PN} += "python-abi"

inherit rpm
