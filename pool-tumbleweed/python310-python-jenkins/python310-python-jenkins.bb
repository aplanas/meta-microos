SUMMARY = "Python bindings for the remote Jenkins API"
DESCRIPTION = "This package provides Python bindings for the Jenkins Remote \
API. It currently supports management of: \
 * Project configuration \
 * Build control \
 * Slave node configuration"
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python310-python-jenkins-1.8.0-1.1.noarch.rpm"
RPM_HASH = "bb68dd7a1d337fff1f717c73cd96545f80b1758e33b3a339cd7a52b144edf51cbc439698ac5cc741bb347a498b44477c40a327331d26fa66c5c6ca2c9548ecf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jenkins \
python3-python-jenkins \
python3.10dist-python-jenkins \
python310-jenkins \
python310-python-jenkins \
python3dist-python-jenkins"

RDEPENDS:${PN} += "python-abi \
python310-multi-key-dict \
python310-pbr \
python310-requests \
python310-six"

inherit rpm
