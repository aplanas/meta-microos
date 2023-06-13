SUMMARY = "PySMB wrapper library"
DESCRIPTION = "easypysmb is a Python library that wraps around the pysmb library."
LICENSE = "GPL-3.0-only"

PV = "1.4.4"

RPM_NAME = "python311-easypysmb-1.4.4-1.12.noarch.rpm"
RPM_HASH = "5408c8f0315204c99a3ee57a81fb69c10e27653b9f0cbb091d231c0f4a9892f91ef919abe470d8d2ca9c70c599fa951c0e0df7c404edb1cbe25eee46040479ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(easypysmb) \
python311-easypysmb \
python3dist(easypysmb)"

RDEPENDS:${PN} += "python(abi) \
python311-pysmb"

inherit rpm
