SUMMARY = "WSGI Transport Adapter for Requests"
DESCRIPTION = "WSGI Transport Adapter for Requests"
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python39-requests-wsgi-adapter-0.4.1-2.1.noarch.rpm"
RPM_HASH = "ab25f22800800db47428f8c986fb63a1ae9dcaf4e440e4d576f816ec7dbe227d3f45ca068cfb2d15327ba0b5a2b4af902651259e1d3cc91f5ec04b116ef2cab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-wsgi-adapter \
python39-requests-wsgi-adapter \
python3dist-requests-wsgi-adapter"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
