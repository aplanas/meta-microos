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

RPM_NAME = "python310-atomicwrites-1.4.1-1.4.noarch.rpm"
RPM_HASH = "ba3cacbb802e474e7ebe74d44ecc7da83127944d507cda97291843764aa58e9c3f95bebee1eaa0a45e82c32aeebd572d1f78e49f74e40b529db7815fc802e868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-atomicwrites \
python3.10dist-atomicwrites \
python310-atomicwrites \
python3dist-atomicwrites"

RDEPENDS:${PN} += "python-abi"

inherit rpm
