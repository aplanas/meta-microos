SUMMARY = "Progress bars for Python"
DESCRIPTION = "Progress bars for Python."
LICENSE = "ISC"

PV = "1.6"

RPM_NAME = "python39-progress-1.6-1.9.noarch.rpm"
RPM_HASH = "cb3d52c418e6e5e29d41183f2a2ef81bdc9805cf7ea7cdfdeea1cb17468840ee56b6a76a88f1aee8e40e6e00ef32c8c4cf6bd6caa585619eee9a0006260a3075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-progress \
python39-progress \
python3dist-progress"

RDEPENDS:${PN} += "python-abi"

inherit rpm
