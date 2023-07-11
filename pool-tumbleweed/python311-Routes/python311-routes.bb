SUMMARY = "Routing Recognition and Generation Tools"
DESCRIPTION = "A Routing package for Python that matches URL's to dicts and vice versa."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python311-Routes-2.5.1-3.5.noarch.rpm"
RPM_HASH = "fd27d21c24dadd1d635d5865c6b189990245a69cc31e4e75e2a9ba3ae5b0680fbfcaec0f6b43d590aa2f9d7d5e928844163afdefeb3f7e8fd035b53c884ca488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Routes \
python3-routes \
python3.11dist-routes \
python311-Routes \
python311-routes \
python3dist-routes"

RDEPENDS:${PN} += "python-abi \
python311-repoze.lru \
python311-six"

inherit rpm
