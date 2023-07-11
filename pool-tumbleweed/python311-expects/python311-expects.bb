SUMMARY = "Expressive and extensible TDD/BDD assertion library for Python"
DESCRIPTION = "'Expects' is an expressive and extensible TDD/BDD assertion library for \
Python. Expects can be extended by defining new matchers."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python311-expects-0.9.0-1.17.noarch.rpm"
RPM_HASH = "91c482407df5fb5fd0ef7184ea5a7c92b60172ea4d6cd87a50724be18111dc3cece7f26e7f25bdd58b974e39fba07d8de5ff46478c2f14eec6f4e8c6360188d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-expects \
python3.11dist-expects \
python311-expects \
python3dist-expects"

RDEPENDS:${PN} += "python-abi"

inherit rpm
