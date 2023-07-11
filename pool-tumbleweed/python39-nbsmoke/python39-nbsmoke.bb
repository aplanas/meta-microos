SUMMARY = "Basic notebook checks"
DESCRIPTION = "Basic notebook smoke tests for checking whether the notebooks run, \
and whether they contain lint."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-nbsmoke-0.6.0-3.5.noarch.rpm"
RPM_HASH = "8be37a442ec35ae0e7a92b13594cb675642689fe2eab6e679ae6f21379f51fc83db97af724cff4a6ea2bf04423f56e135cbebadacc8f6391788509c6cfb566e7"
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
