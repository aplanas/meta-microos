SUMMARY = "Basic notebook checks"
DESCRIPTION = "Basic notebook smoke tests for checking whether the notebooks run, \
and whether they contain lint."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-nbsmoke-0.6.0-4.1.noarch.rpm"
RPM_HASH = "53231d7344718f2a07158bbd76e164c05cdcd2ff37611b2ac2b92f35d818bf51be02b6e29229b89f066e0881aa42fde71cd5a059885da9493f496292f11251d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nbsmoke \
python39-jupyter-nbsmoke \
python39-nbsmoke \
python3dist-nbsmoke"

RDEPENDS:${PN} += "python-abi \
python39-ipykernel \
python39-jupyter-client \
python39-nbconvert \
python39-nbformat \
python39-param \
python39-pyflakes \
python39-pytest"

inherit rpm
