SUMMARY = "Expressive and extensible TDD/BDD assertion library for Python"
DESCRIPTION = "'Expects' is an expressive and extensible TDD/BDD assertion library for \
Python. Expects can be extended by defining new matchers."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python39-expects-0.9.0-1.17.noarch.rpm"
RPM_HASH = "880e2dfdc23304cf6aec48c1e6b0fa5689d01825923aca144100495c83351f4c1c40f3309f1a67d7ee8783dc1def1647b2fe4ad97fc7f2d8a035f7a8b6dbb2b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-expects \
python39-expects \
python3dist-expects"

RDEPENDS:${PN} += "python-abi"

inherit rpm
