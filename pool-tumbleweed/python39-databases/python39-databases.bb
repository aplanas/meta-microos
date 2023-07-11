SUMMARY = "Async database support for Python"
DESCRIPTION = "Async database support for Python."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python39-databases-0.7.0-2.1.noarch.rpm"
RPM_HASH = "fb1bba742899dfcc6bdd5e4099d0e9258e2e8b5cc6b297477676ca3043b55e6a4700c51018f8709070e9a7d16ebc0d44b2fb04a222463fc51b5ba0281d293ae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-databases \
python39-databases \
python3dist-databases"

RDEPENDS:${PN} += "-python39-sqlalchemy >= 1.4 with python39-sqlalchemy < 2 \
python-abi"

inherit rpm
