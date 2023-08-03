SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "12.0"

RPM_NAME = "python311-pytest-rerunfailures-12.0-1.1.noarch.rpm"
RPM_HASH = "dfcb340f302f61baf8ca66b3c2116682ba81b54ab56fddc51250cf63735c2002e22f76d01c532aff5e0a56f2611744a3b4738886ec651ba9efc09ed3149b030a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-rerunfailures \
python3.11dist-pytest-rerunfailures \
python311-pytest-rerunfailures \
python3dist-pytest-rerunfailures"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-setuptools"

inherit rpm
