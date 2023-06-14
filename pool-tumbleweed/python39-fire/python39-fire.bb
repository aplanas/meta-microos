SUMMARY = "A library for automatically generating command line interfaces"
DESCRIPTION = "Python Fire is a library for automatically generating command line \
interfaces (CLIs) from a Python object."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python39-fire-0.5.0-1.3.noarch.rpm"
RPM_HASH = "9bc175c5707271144ad6fe83f9923c5e5f9a8c140b2df99d80a8925e1f4575bda43d3881f6a2fc4525360c83c97993afa30d9c3af6b03e60b3a1334ec77dfa56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fire \
python39-fire \
python3dist-fire"

RDEPENDS:${PN} += "python-abi \
python39-six \
python39-termcolor"

inherit rpm
