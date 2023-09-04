SUMMARY = "Basic notebook checks"
DESCRIPTION = "Basic notebook smoke tests for checking whether the notebooks run, \
and whether they contain lint."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-nbsmoke-0.6.0-4.1.noarch.rpm"
RPM_HASH = "08b40b05c1894c23204841855274acb52be74902936f37c932f714c6e5b9b5488c5db728315adea9282e153a70251492f5c06d21713f5edd7c6d010f62378c49"
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
