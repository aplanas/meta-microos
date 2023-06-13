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

RPM_NAME = "python-atomicwrites-doc-doc-1.4.1-1.3.noarch.rpm"
RPM_HASH = "4b4c209b4b96ac6094889145705bf4203e08a82214483c56f270f742f2f0fd5729ae46ca3ed64e2448d73c825a76fdc3ef1cd2bb0adbfcb6b3539bd795ab940a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-atomicwrites-doc-doc"

RDEPENDS:${PN} += ""

inherit rpm
