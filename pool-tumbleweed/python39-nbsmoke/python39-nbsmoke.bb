SUMMARY = "Basic notebook checks"
DESCRIPTION = "Basic notebook smoke tests for checking whether the notebooks run, \
and whether they contain lint."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-nbsmoke-0.6.0-3.4.noarch.rpm"
RPM_HASH = "819e52d75b8b7e1df0e9f8225104a2785424ff4db7bf1267bcb26400c99daf0746d5da222da9ab97e480a1575636d3c11510e10ee42d7d28bce251cb99e07a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nbsmoke) \
python39-jupyter_nbsmoke \
python39-nbsmoke \
python3dist(nbsmoke)"

RDEPENDS:${PN} += "python(abi) \
python39-ipykernel \
python39-jupyter-client \
python39-nbconvert \
python39-nbformat \
python39-param \
python39-pyflakes \
python39-pytest"

inherit rpm
