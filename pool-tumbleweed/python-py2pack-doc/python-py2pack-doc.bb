SUMMARY = "Documentation for python-py2pack"
DESCRIPTION = "Documentation and help files for python-py2pack."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python-py2pack-doc-0.9.0-2.3.noarch.rpm"
RPM_HASH = "6cd5371da8eeab6e29a5f1fde77ea21acfa02dfcb27434ff01cd6b5ef8b8e2bd65c4c91a794d345f902be949b19ea26b6bd73cb502844d04b2d104cf29b6f7b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-py2pack-doc \
python310-py2pack-doc \
python311-py2pack-doc \
python39-py2pack-doc"

RDEPENDS:${PN} += ""

inherit rpm
