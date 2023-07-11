SUMMARY = "Python client library for Core API"
DESCRIPTION = "Python client library for Core API, a format-independent Document Object Model \
for representing Web APIs."
LICENSE = "BSD-2-Clause"

PV = "2.3.3"

RPM_NAME = "python310-coreapi-2.3.3-2.1.noarch.rpm"
RPM_HASH = "e6757acb1edbb55e08ad901086c605c3f410d4b72ad868983dec3c2c41dec654e85d1a48833dd1a2fdabbef83c0ba64c783d7e787a2ef584bede8d70a268876f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-coreapi \
python310-coreapi \
python3dist-coreapi"

RDEPENDS:${PN} += "python-abi \
python310-coreschema \
python310-itypes \
python310-requests \
python310-uritemplate"

inherit rpm
