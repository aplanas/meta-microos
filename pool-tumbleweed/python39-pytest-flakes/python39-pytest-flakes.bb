SUMMARY = "Pytest plugin to check source code with pyflakes"
DESCRIPTION = "py.test plugin for efficiently checking python source with pyflakes."
LICENSE = "MIT"

PV = "4.0.5"

RPM_NAME = "python39-pytest-flakes-4.0.5-1.8.noarch.rpm"
RPM_HASH = "40199561b24ffef6b2bc510f79805a570bf5a5e5bafa13f9861c93917ae750b052f81f867958b9c19cca33e0834c02154e1ae4073599d13efcfc99ea2f044391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-flakes \
python39-pytest-flakes \
python3dist-pytest-flakes"

RDEPENDS:${PN} += "python-abi \
python39-pyflakes \
python39-pytest"

inherit rpm
