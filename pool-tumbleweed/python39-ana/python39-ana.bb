SUMMARY = "The Python 'ana' module"
DESCRIPTION = "A Python module that provides an undocumented data layer for Python objects."
LICENSE = "BSD-2-Clause"

PV = "0.06"

RPM_NAME = "python39-ana-0.06-3.5.noarch.rpm"
RPM_HASH = "e70572b70c0a1306999d0770af1c0c9ec59cd39cc2e8a73c3170aaeb0330add5d918f9834b41aaed06a5aac1570b513d0d1bb140615e6ef04aeb54870518c23a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ana \
python39-ana \
python3dist-ana"

RDEPENDS:${PN} += "python-abi \
python39-future"

inherit rpm
