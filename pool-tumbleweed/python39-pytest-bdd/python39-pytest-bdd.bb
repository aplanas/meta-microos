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

RPM_NAME = "python39-pytest-bdd-5.0.0-1.9.noarch.rpm"
RPM_HASH = "bbd49ce9dca4c609942c5857a77adef2939c150b5d97440985b667da9745048aad200b92819d6a657a0f06df3f3c72f4baa0846b3f018a991558cefc574ead6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-bdd \
python39-pytest-bdd \
python3dist-pytest-bdd"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Mako \
python39-glob2 \
python39-parse \
python39-parse-type \
python39-py \
python39-pytest \
update-alternatives"

inherit rpm
