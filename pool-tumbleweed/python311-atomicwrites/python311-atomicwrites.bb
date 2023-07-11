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

RPM_NAME = "python311-atomicwrites-1.4.1-1.5.noarch.rpm"
RPM_HASH = "dc0cf44734f86a3120af9137a513ed3d1201e1c7939a29d008c51284bdfb96a2e28cc979f5dba52cf7aefc331c37bce307e8bded5875e113a547acdaa03d7c38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-atomicwrites \
python3.11dist-atomicwrites \
python311-atomicwrites \
python3dist-atomicwrites"

RDEPENDS:${PN} += "python-abi"

inherit rpm
