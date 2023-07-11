SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "11.1.2"

RPM_NAME = "python311-pytest-rerunfailures-11.1.2-1.3.noarch.rpm"
RPM_HASH = "e66db764d222f80d025c952c9bf59d2859a0e08d346376cd82aab0ae4a9024402751d485c8124346dd9928c146c59f6fa7a95f89a05cc9a27880f3d94aad11a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-rerunfailures \
python3.11dist-pytest-rerunfailures \
python311-pytest-rerunfailures \
python3dist-pytest-rerunfailures"

RDEPENDS:${PN} += "python-abi \
python311-pytest \
python311-setuptools"

inherit rpm
