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

RPM_NAME = "python310-pytest-bdd-5.0.0-1.9.noarch.rpm"
RPM_HASH = "2fc1597458448bd8992dbaec2e89e315bc846301927f0371a2f5e7771d3e58f1377c17efc66e20e8a016c65a1de497f1dae56095fa06c8775271ebef7d9b7ddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-bdd \
python310-pytest-bdd \
python3dist-pytest-bdd"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Mako \
python310-glob2 \
python310-parse \
python310-parse-type \
python310-py \
python310-pytest \
update-alternatives"

inherit rpm
