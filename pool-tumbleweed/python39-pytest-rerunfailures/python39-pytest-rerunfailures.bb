SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "11.1.2"

RPM_NAME = "python39-pytest-rerunfailures-11.1.2-1.3.noarch.rpm"
RPM_HASH = "277e9fc158e77c0635184d72d907f6d9c6f27ca25668089a916c60cc46c34248aeb29499e3dc9ca82b16a891376e161f9602e23e26d880030e318417916580df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-rerunfailures \
python39-pytest-rerunfailures \
python3dist-pytest-rerunfailures"

RDEPENDS:${PN} += "python-abi \
python39-pytest \
python39-setuptools"

inherit rpm
