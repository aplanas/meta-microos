SUMMARY = "A collection of cache libraries in the same API interface"
DESCRIPTION = "A collection of cache libraries in the same API interface."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "python39-cachelib-0.10.2-2.1.noarch.rpm"
RPM_HASH = "c3b228bea9ac1f07713a5294e8b7b0685bf20b7ca7ba864756121c6e2fd6172b2dd03bed013d49af5a1da7295bf06530d10a4e239b34373a5dfd6dbc02f082ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cachelib) \
python39-cachelib \
python3dist(cachelib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
