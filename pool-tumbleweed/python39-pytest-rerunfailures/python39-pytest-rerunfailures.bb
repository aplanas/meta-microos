SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "12.0"

RPM_NAME = "python39-pytest-rerunfailures-12.0-1.1.noarch.rpm"
RPM_HASH = "b8636e6b268121bea521f0e9739a2229dce7e5f8b6105bb9478661ac72b7ebdfb99a5ee0ef1f25b7928ea551956e0b61e1c6c987285f7830f2895a5db94178b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-rerunfailures \
python39-pytest-rerunfailures \
python3dist-pytest-rerunfailures"

RDEPENDS:${PN} += "python-abi \
python39-pytest \
python39-setuptools"

inherit rpm
