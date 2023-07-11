SUMMARY = "Basic notebook checks"
DESCRIPTION = "Basic notebook smoke tests for checking whether the notebooks run, \
and whether they contain lint."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-nbsmoke-0.6.0-3.5.noarch.rpm"
RPM_HASH = "38f252e3f5af5ddacf59c639f8d09f28b283c5144d84ff7f52fad38e4a95c9a7eff53f0b568cb3240d7aabfc4409b423da529d0aa8a218f44e21d055d5fd9325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbsmoke \
python3-jupyter-nbsmoke \
python3-nbsmoke \
python3.11dist-nbsmoke \
python311-jupyter-nbsmoke \
python311-nbsmoke \
python3dist-nbsmoke"

RDEPENDS:${PN} += "python-abi \
python311-ipykernel \
python311-jupyter-client \
python311-nbconvert \
python311-nbformat \
python311-param \
python311-pyflakes \
python311-pytest"

inherit rpm
