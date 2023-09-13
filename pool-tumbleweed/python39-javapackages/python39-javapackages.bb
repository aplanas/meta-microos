SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "python39-javapackages-6.2.0-2.1.noarch.rpm"
RPM_HASH = "951a17efc96d5f1303c807bfe1e9db2d3668441b97a45164b6a54cf3070db7e809fe635f734d247db78ca42b035b2e783d9e0e19528b06f921aac73f8d159679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-javapackages \
python39-javapackages \
python3dist-javapackages"

RDEPENDS:${PN} += "python-abi \
python39-lxml \
python39-xml"

inherit rpm
