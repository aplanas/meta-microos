SUMMARY = "Python bindings for the remote Jenkins API"
DESCRIPTION = "This package provides Python bindings for the Jenkins Remote \
API. It currently supports management of: \
 * Project configuration \
 * Build control \
 * Slave node configuration"
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python39-python-jenkins-1.8.0-2.1.noarch.rpm"
RPM_HASH = "307259209b0834001d3b275d28f4a7e3cb57a47486b5ac74d8dfd1a478abcf9677b1b721707dbbe9b02dc4bf69c64d8e8e04777f3b72409a4d8d0ae917c76137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-jenkins \
python39-jenkins \
python39-python-jenkins \
python3dist-python-jenkins"

RDEPENDS:${PN} += "python-abi \
python39-multi-key-dict \
python39-pbr \
python39-requests \
python39-six \
python39-urllib3"

inherit rpm
