SUMMARY = "Expressive and extensible TDD/BDD assertion library for Python"
DESCRIPTION = "'Expects' is an expressive and extensible TDD/BDD assertion library for \
Python. Expects can be extended by defining new matchers."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python310-expects-0.9.0-1.17.noarch.rpm"
RPM_HASH = "0213dc0746d62dd0092e302b23a3d54c385f386b242865b93e2581aaa90aa76db41ef5e3d59987d114284c906bf120425d1b43b1af07e5d3500d671504e0573f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-expects \
python310-expects \
python3dist-expects"

RDEPENDS:${PN} += "python-abi"

inherit rpm
