SUMMARY = "Routing Recognition and Generation Tools"
DESCRIPTION = "A Routing package for Python that matches URL's to dicts and vice versa."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python310-Routes-2.5.1-3.3.noarch.rpm"
RPM_HASH = "d7941bcf2d78648fb167eb4f34b9abb6efee7e43d13c439470840b5bb5b63d39e3947a8cda8bbf7803ff417b900295f64084759c974960561871fbbc8c4c3435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Routes \
python3-routes \
python3.10dist-routes \
python310-Routes \
python310-routes \
python3dist-routes"

RDEPENDS:${PN} += "python-abi \
python310-repoze.lru \
python310-six"

inherit rpm
