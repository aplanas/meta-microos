SUMMARY = "Tools to work with collections"
DESCRIPTION = "jaraco.collections Tools for working with collections. \
Models and classes to supplement the stdlib ‘collections’ module."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python39-jaraco.collections-4.1.0-1.3.noarch.rpm"
RPM_HASH = "25a866a60ace4fa4fca5c25c1742ece02cb32ec360a53bb28289e57363341781c5d0e24c4caa38ab1f31842b410fca8bc2a4c8d39e2d6e4d85112f4185955319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.collections \
python39-jaraco.collections \
python3dist-jaraco.collections"

RDEPENDS:${PN} += "python-abi \
python39-jaraco.classes \
python39-jaraco.text"

inherit rpm
