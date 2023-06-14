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

RPM_NAME = "python39-pytest-bdd-5.0.0-1.7.noarch.rpm"
RPM_HASH = "64da562ad55f0b4cbf2cfb74252629cb911fb954e13caeaa4b6a0ccc73adf7212094c861d5c500efa021818af320b2a7f8b9bdfe2fce861632b3b0caee024ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-bdd \
python39-pytest-bdd \
python3dist-pytest-bdd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-Mako \
python39-glob2 \
python39-parse \
python39-parse-type \
python39-py \
python39-pytest \
update-alternatives"

inherit rpm
