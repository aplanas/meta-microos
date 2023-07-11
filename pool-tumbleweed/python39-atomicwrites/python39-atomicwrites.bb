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

RPM_NAME = "python39-atomicwrites-1.4.1-1.5.noarch.rpm"
RPM_HASH = "bb10cf334be1479074c8202234e6d2c393d462c22da265ae41d8b70de44cbdd6d156c701ad0b6343378cbca7e81e7c7ce0d006149d48dd9796fa2ba60c40f39d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-atomicwrites \
python39-atomicwrites \
python3dist-atomicwrites"

RDEPENDS:${PN} += "python-abi"

inherit rpm
