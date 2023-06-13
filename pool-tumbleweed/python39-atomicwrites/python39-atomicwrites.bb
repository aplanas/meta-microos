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

RPM_NAME = "python39-atomicwrites-1.4.1-1.4.noarch.rpm"
RPM_HASH = "0e5991ba1a0b20ee46d90cb0d354060f9a1a52c42931ffbbfd16525f42742c3cfa80724c41327bc6ae01d1b9a451851f4558ce670e0485e94eda344f5571ffbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(atomicwrites) \
python39-atomicwrites \
python3dist(atomicwrites)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
