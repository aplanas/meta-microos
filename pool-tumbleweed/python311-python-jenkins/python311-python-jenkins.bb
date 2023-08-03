SUMMARY = "Python bindings for the remote Jenkins API"
DESCRIPTION = "This package provides Python bindings for the Jenkins Remote \
API. It currently supports management of: \
 * Project configuration \
 * Build control \
 * Slave node configuration"
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python311-python-jenkins-1.8.0-2.1.noarch.rpm"
RPM_HASH = "eb1ad4c9ddb50dde8241e70c2164b8db9a2695a306f72cb8f6afc2dec71a24463d621bb443afe7091e8a6d2dc914a9f334af3cc59e2c8c742129ef568af717ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jenkins \
python3-python-jenkins \
python3.11dist-python-jenkins \
python311-jenkins \
python311-python-jenkins \
python3dist-python-jenkins"

RDEPENDS:${PN} += "python-abi \
python311-multi-key-dict \
python311-pbr \
python311-requests \
python311-six \
python311-urllib3"

inherit rpm
