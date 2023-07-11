SUMMARY = "Basic notebook checks"
DESCRIPTION = "Basic notebook smoke tests for checking whether the notebooks run, \
and whether they contain lint."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python310-nbsmoke-0.6.0-3.5.noarch.rpm"
RPM_HASH = "f791dbcd0d577ff1d45dd70abad919e451aadaaa729f5c190a53d64b8c1eb011367a2989124b20eec4e72ec656673ac4a2b379eb07bfdf7781f15d95ba81724d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nbsmoke \
python310-jupyter-nbsmoke \
python310-nbsmoke \
python3dist-nbsmoke"

RDEPENDS:${PN} += "python-abi \
python310-ipykernel \
python310-jupyter-client \
python310-nbconvert \
python310-nbformat \
python310-param \
python310-pyflakes \
python310-pytest"

inherit rpm
