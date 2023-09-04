SUMMARY = "More sophisticated version manipulation (than packaging)"
DESCRIPTION = "More sophisticated version manipulation (than packaging)"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-jaraco.versioning-1.1.0-1.1.noarch.rpm"
RPM_HASH = "7d0df9c95566fbb28fdff98645938e3aca2c01729373619034990bf2fc037fc39d7c28fba3cc8166213b9c93f0feabb372e6c0718ba45be1cb760f61073c3120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.versioning \
python39-jaraco.versioning \
python3dist-jaraco.versioning"

RDEPENDS:${PN} += "python-abi \
python39-packaging"

inherit rpm
