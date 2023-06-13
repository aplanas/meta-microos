SUMMARY = "HTTP library inspired by python-requests"
DESCRIPTION = "treq is an HTTP library inspired by requests but written on top of Twisted’s Agents. \
It provides a simple, higher level API for making HTTP requests when using Twisted."
LICENSE = "MIT"

PV = "22.2.0"

RPM_NAME = "python39-treq-22.2.0-2.7.noarch.rpm"
RPM_HASH = "3d72f2a3ea00b7ba67b9dcbf6c16b0643cd8baf34d0d61693c5e102d38cba0f6d3885f9830e49f19715dd72346aab51f8a267f589b1ef49788e0b1d4122b45a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(treq) \
python39-treq \
python3dist(treq)"

RDEPENDS:${PN} += "python(abi) \
python39-Twisted-tls \
python39-attrs \
python39-hyperlink \
python39-incremental \
python39-requests"

inherit rpm
