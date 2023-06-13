SUMMARY = "OpenStack Docs Tools"
DESCRIPTION = "Tools used by the OpenStack Documentation Project. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "python3-openstack-doc-tools-3.3.1-1.3.noarch.rpm"
RPM_HASH = "9867b7d122d584794dc0e4c493e0b77e34b2bd0561657c24c7485f592ede549db69a4e6117ea4da4f5d9d66f0844ed9d17232f63ca2a6d7c6b1209f17b86cfb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openstack-doc-tools \
python3.10dist(openstack-doc-tools) \
python3dist(openstack-doc-tools)"

RDEPENDS:${PN} += "/bin/bash \
python(abi) \
python3-PyYAML \
python3-Sphinx \
python3-iso8601 \
python3-lxml \
python3-openstackdocstheme"

inherit rpm
