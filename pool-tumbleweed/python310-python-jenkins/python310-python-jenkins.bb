SUMMARY = "Python bindings for the remote Jenkins API"
DESCRIPTION = "This package provides Python bindings for the Jenkins Remote \
API. It currently supports management of: \
 * Project configuration \
 * Build control \
 * Slave node configuration"
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python310-python-jenkins-1.8.0-2.1.noarch.rpm"
RPM_HASH = "29c3986e83ee5951ad777e9f7fe12dc6d9c54e99a6ddab8a6df3f1b98c4a58f03b1a0bf60e54de8af98db591d022dea960a59e179b89faee90a67b3779a2beef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-jenkins \
python310-jenkins \
python310-python-jenkins \
python3dist-python-jenkins"

RDEPENDS:${PN} += "python-abi \
python310-multi-key-dict \
python310-pbr \
python310-requests \
python310-six \
python310-urllib3"

inherit rpm
