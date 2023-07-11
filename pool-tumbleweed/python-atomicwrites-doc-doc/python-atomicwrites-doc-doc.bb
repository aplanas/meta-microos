SUMMARY = "Atomic file writes for Python (documentation)"
DESCRIPTION = "Atomic file writes for python3. \
Features that distinguish it from other similar libraries: \
 \
- Race-free assertion that the target file doesn't yet exist. This can be \
  controlled with the 'overwrite' parameter. \
 \
- High-level API that wraps a very flexible class-based API. \
 \
This package contains the documentation for both python2 and python3 versions \
of python-atomicwrites"
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python-atomicwrites-doc-doc-1.4.1-1.4.noarch.rpm"
RPM_HASH = "fd344d2c5af2f312c2e01c53865218a19ac28c146794eeedc56ade3e92773f47ec8185bd536e19509acf164d02286a88484f5e627644d90298c3068facfae59b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-atomicwrites-doc-doc"

RDEPENDS:${PN} += ""

inherit rpm
