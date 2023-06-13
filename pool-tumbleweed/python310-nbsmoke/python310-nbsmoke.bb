SUMMARY = "Basic notebook checks"
DESCRIPTION = "Basic notebook smoke tests for checking whether the notebooks run, \
and whether they contain lint."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python310-nbsmoke-0.6.0-3.4.noarch.rpm"
RPM_HASH = "98bfea6bb90895cfc5547fb8821c63e370267a7fa0505a27646bb06899cb6a08b08d35e04c53b1d828e2b4eeb84d6af9e05ac9620d2fa68d1fb72d5dee86abc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbsmoke \
python3-jupyter_nbsmoke \
python3-nbsmoke \
python3.10dist(nbsmoke) \
python310-jupyter_nbsmoke \
python310-nbsmoke \
python3dist(nbsmoke)"

RDEPENDS:${PN} += "python(abi) \
python310-ipykernel \
python310-jupyter-client \
python310-nbconvert \
python310-nbformat \
python310-param \
python310-pyflakes \
python310-pytest"

inherit rpm
