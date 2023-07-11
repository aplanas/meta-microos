SUMMARY = "Python module to build tested documentation"
DESCRIPTION = "Manuel lets the user build tested documentation. \
 \
Documentation, a full list of included plug-ins, and examples are available \
with the -doc package and at http://packages.python.org/manuel/."
LICENSE = "Apache-2.0"

PV = "1.12.4"

RPM_NAME = "python310-manuel-1.12.4-4.2.noarch.rpm"
RPM_HASH = "bf6e0379adce8583deb2b96d7c591daa4913b892be2f2b1ffb7adf0451565fce16defcd4d245aab8212f7aaaf59e7578291defdf37e0a4d6acc7417252039d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-manuel \
python310-manuel \
python3dist-manuel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
