SUMMARY = "Small personal collection of python utility functions"
DESCRIPTION = "Small personal collection of python utility functions"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python310-littleutils-0.2.2-2.1.noarch.rpm"
RPM_HASH = "dbf28a7ffbc9acca2e96fd79bba4f75102fdb178f1d7885ef0bc764d35b70baabaffd0ffdda7c50e23cefd7fc386476dc74a388425dde1cae217abb8a0e416e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-littleutils \
python3.10dist(littleutils) \
python310-littleutils \
python3dist(littleutils)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
