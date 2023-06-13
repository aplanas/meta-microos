SUMMARY = "Module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a 'user data dir'."
LICENSE = "MIT"

PV = "3.5.1"

RPM_NAME = "python39-platformdirs-3.5.1-1.1.noarch.rpm"
RPM_HASH = "5dbd91f7d8b85f13699120211156b4cb2c6e9c4318e17f6758549dfb0acdc4d03e5ad2a2039392dfc73edfd601c961e39648cc7c0af87948bcf0d06533eda17a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(platformdirs) \
python39-platformdirs \
python3dist(platformdirs)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
