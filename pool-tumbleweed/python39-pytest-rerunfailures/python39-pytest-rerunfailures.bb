SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "11.1.2"

RPM_NAME = "python39-pytest-rerunfailures-11.1.2-1.1.noarch.rpm"
RPM_HASH = "ffb830ace4023ae0b1dadb39e42ad00784b0e9a917e4f3fc5f52001969e995480711d3ab0656ceb3d657040fdc1447e9a6f2c870f7521851e5d9c785eb306af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-rerunfailures) \
python39-pytest-rerunfailures \
python3dist(pytest-rerunfailures)"
RDEPENDS:${PN} += "python(abi) \
python39-pytest \
python39-setuptools"

inherit rpm
