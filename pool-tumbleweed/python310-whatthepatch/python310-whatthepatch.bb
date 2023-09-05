SUMMARY = "A patch parsing and application library"
DESCRIPTION = "A patch parsing and application library."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python310-whatthepatch-1.0.5-1.1.noarch.rpm"
RPM_HASH = "2c7ba7caa5919a4aa0e81a46b66c0990bd09584d96c8e3ec18e99ed8e1591cba3a7490b06ab01c3628442e82d1e34f564beadeb3ea8600deea5e48d1d3fc7f56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-whatthepatch \
python310-whatthepatch \
python3dist-whatthepatch"

RDEPENDS:${PN} += "ed \
patch \
python-abi"

inherit rpm
