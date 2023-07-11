SUMMARY = "Implements a topological sort algorithm"
DESCRIPTION = "Implements a topological sort algorithm."
LICENSE = "Apache-2.0"

PV = "1.7"

RPM_NAME = "python311-toposort-1.7-1.16.noarch.rpm"
RPM_HASH = "d3e2ad72f446179c3f5f41eb3586df1a8cb811c37c7c00a5f94ba7cf66c9ad3457ce4854e6ff9d3328e100655c98f67bcf62ca2fc9213bdff3e5b468db4eca1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-toposort \
python3.11dist-toposort \
python311-toposort \
python3dist-toposort"

RDEPENDS:${PN} += "python-abi"

inherit rpm
