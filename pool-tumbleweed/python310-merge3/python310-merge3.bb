SUMMARY = "Python implementation of 3-way merge"
DESCRIPTION = "Python implementation of 3-way merge"
LICENSE = "GPL-2.0-or-later"

PV = "0.0.12"

RPM_NAME = "python310-merge3-0.0.12-1.5.noarch.rpm"
RPM_HASH = "15f6a9521d99d5bcb7463bc33745061646355d3ed0b4b8ead2fd28f6d9d892d9a6d96b6293d2b87e3b8a26e249128a8902894532c8687707717ac332ce80e69f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-merge3 \
python310-merge3 \
python3dist-merge3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
