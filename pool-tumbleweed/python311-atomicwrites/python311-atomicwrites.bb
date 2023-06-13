SUMMARY = "Atomic file writes for Python"
DESCRIPTION = "Atomic file writes for python3. \
Features that distinguish it from other similar libraries: \
 \
- Race-free assertion that the target file doesn't yet exist. This can be \
  controlled with the 'overwrite' parameter. \
 \
- High-level API that wraps a very flexible class-based API."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python311-atomicwrites-1.4.1-1.4.noarch.rpm"
RPM_HASH = "dbc9641e383ea93aa2ce69aebbefa2677e0d33fa3b3e73c82483fe741d4b78ed19e3612e33e038b57a5f28f9235ccefc5f7dc32c3d63f6480bb630d5e7a4340b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(atomicwrites) \
python311-atomicwrites \
python3dist(atomicwrites)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
