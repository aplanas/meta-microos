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

RPM_NAME = "python310-atomicwrites-1.4.1-1.5.noarch.rpm"
RPM_HASH = "33f3633556bb3e77106a35c75f039ee722fd0f2667b4dbc21b7aa8d7ed48e6cdc920a481a24a5f393cc8f108af4ee7e44c27cb4ba2f4fcd7a09db06c3c2d94bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-atomicwrites \
python310-atomicwrites \
python3dist-atomicwrites"

RDEPENDS:${PN} += "python-abi"

inherit rpm
