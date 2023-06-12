SUMMARY = "BDD for pytest"
DESCRIPTION = "BDD library for the py.test runner \
 \
pytest-bdd implements a subset of Gherkin language for the automation of the project \
requirements testing and easier behavioral driven development. \
 \
Unlike many other BDD tools it doesn't require a separate runner and benefits from \
the power and flexibility of the pytest. It allows to unify your unit and functional \
tests, easier continuous integration server configuration and maximal reuse of the \
tests setup. \
 \
Pytest fixtures written for the unit tests can be reused for the setup and actions \
mentioned in the feature steps with dependency injection, which allows a true BDD \
just-enough specification of the requirements without maintaining any context object \
containing the side effects of the Gherkin imperative declarations."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python310-pytest-bdd-5.0.0-1.7.noarch.rpm"
RPM_HASH = "76adec00b6fdb9d48ca6bf65add50379e603e7e7dd71a0d18d2ad284cdbe67cbb5d2f518b3982f71b13d264b37427d46bd72bd9518648f1afbe218945e5607eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-bdd \
python3.10dist(pytest-bdd) \
python310-pytest-bdd \
python3dist(pytest-bdd)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Mako \
python310-glob2 \
python310-parse \
python310-parse_type \
python310-py \
python310-pytest \
update-alternatives"

inherit rpm
