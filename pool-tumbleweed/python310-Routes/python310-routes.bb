SUMMARY = "Routing Recognition and Generation Tools"
DESCRIPTION = "A Routing package for Python that matches URL's to dicts and vice versa."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python310-Routes-2.5.1-3.5.noarch.rpm"
RPM_HASH = "aea7ea95df9821b83b90b09962a2277d6c18df55a0b0204c3b00c0f04004c19bdb3a9f5dc51d48641e024ebebde6a076a6b1b1237fd174ea5a73e735f1c853bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-routes \
python310-Routes \
python310-routes \
python3dist-routes"

RDEPENDS:${PN} += "python-abi \
python310-repoze.lru \
python310-six"

inherit rpm
