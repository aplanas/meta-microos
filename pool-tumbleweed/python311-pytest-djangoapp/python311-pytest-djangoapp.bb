SUMMARY = "Pytest plugin for Django pluggable application testing"
DESCRIPTION = "A pytest plugin to help with Django pluggable application testing."
LICENSE = "BSD-3-Clause"

PV = "0.15.2"

RPM_NAME = "python311-pytest-djangoapp-0.15.2-2.7.noarch.rpm"
RPM_HASH = "9e3b9d463c01fc2bf1fd24e5c3cdd44ac0e7eda77f788fbe7e94d0bf95641e9a59630187dfc6284ae8b4aaf10c73a4f277be146543f3d42ae726e7f0f9ef47cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-djangoapp) \
python311-pytest-djangoapp \
python3dist(pytest-djangoapp)"

RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-pytest"

inherit rpm
