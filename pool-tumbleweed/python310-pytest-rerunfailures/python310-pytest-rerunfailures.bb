SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "11.1.2"

RPM_NAME = "python310-pytest-rerunfailures-11.1.2-1.3.noarch.rpm"
RPM_HASH = "c67fe37bcd1ef260dd345d89196b1d9b7e72e33008e6b4d47f58b884efcec3b41c9269abe1a60b01968d232164aac706af4e2480cf2d689cc91aa2817ea34a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-rerunfailures \
python310-pytest-rerunfailures \
python3dist-pytest-rerunfailures"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-setuptools"

inherit rpm
