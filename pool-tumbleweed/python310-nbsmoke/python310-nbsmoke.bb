SUMMARY = "Basic notebook checks"
DESCRIPTION = "Basic notebook smoke tests for checking whether the notebooks run, \
and whether they contain lint."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python310-nbsmoke-0.6.0-4.1.noarch.rpm"
RPM_HASH = "d117121598dc68fbae3b7fee785dc3f4020600d671c378dfd37245e2195cb946fe5dd609f53dd98b631c1496ed351d0671a221d3b2534afff71e3c2763a0999c"
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
