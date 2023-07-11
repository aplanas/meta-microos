SUMMARY = "Python module to build tested documentation"
DESCRIPTION = "Manuel lets the user build tested documentation. \
 \
Documentation, a full list of included plug-ins, and examples are available \
with the -doc package and at http://packages.python.org/manuel/."
LICENSE = "Apache-2.0"

PV = "1.12.4"

RPM_NAME = "python311-manuel-1.12.4-4.2.noarch.rpm"
RPM_HASH = "cea55ef1f8d470bc93c1cdeb8d3ecbac9faf38991081be19ed72258957110f8cb27ae3f56663cf5b6be5a7e3bbe3d91d2e7ce71e3cefdf8b1e41c68f2a7764d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-manuel \
python3.11dist-manuel \
python311-manuel \
python3dist-manuel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
