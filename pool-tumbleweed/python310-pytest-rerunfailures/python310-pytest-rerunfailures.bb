SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "12.0"

RPM_NAME = "python310-pytest-rerunfailures-12.0-1.1.noarch.rpm"
RPM_HASH = "0ab712177b29542f0eea5d37bd4810a2efd64a05e0d79d031fd0619e780572fb8cbda40f5ae4f4a4d4b7a5ba34965ff8598dc0fa0b7e4db2dd6537adbc0bb7ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-rerunfailures \
python310-pytest-rerunfailures \
python3dist-pytest-rerunfailures"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-setuptools"

inherit rpm
