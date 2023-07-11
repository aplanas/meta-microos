SUMMARY = "Routing Recognition and Generation Tools"
DESCRIPTION = "A Routing package for Python that matches URL's to dicts and vice versa."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python39-Routes-2.5.1-3.5.noarch.rpm"
RPM_HASH = "8f009363288f3407f3392708a1152413bafca4ca55600fea4075e66f2c20a5f69449a1e7fea90ec00631e711317e4c8cdca0134d2f7f760a3960d88efb3acc93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-routes \
python39-Routes \
python39-routes \
python3dist-routes"

RDEPENDS:${PN} += "python-abi \
python39-repoze.lru \
python39-six"

inherit rpm
