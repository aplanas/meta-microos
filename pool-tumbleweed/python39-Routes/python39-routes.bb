SUMMARY = "Routing Recognition and Generation Tools"
DESCRIPTION = "A Routing package for Python that matches URL's to dicts and vice versa."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python39-Routes-2.5.1-3.3.noarch.rpm"
RPM_HASH = "ee7a67a844fa66439766d43160eaa6d0d24da7ee61880ac109310634e26f8eda527e47d201743dbbcc615a20ccf22262fd8a15794e18208ddfb678c21dc4b96f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(routes) \
python39-Routes \
python39-routes \
python3dist(routes)"

RDEPENDS:${PN} += "python(abi) \
python39-repoze.lru \
python39-six"

inherit rpm
