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

RPM_NAME = "python311-pytest-bdd-5.0.0-1.9.noarch.rpm"
RPM_HASH = "aec5a8133a84dc1cf1df68a40dbf2f543a022bd22c4ae37165d6e9f2b0b4fb1a89b2049c3fc4f7417f1554b906d6a3814a7377f5574ebb8bd2d603e913548ad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-bdd \
python3.11dist-pytest-bdd \
python311-pytest-bdd \
python3dist-pytest-bdd"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Mako \
python311-glob2 \
python311-parse \
python311-parse-type \
python311-py \
python311-pytest \
update-alternatives"

inherit rpm
