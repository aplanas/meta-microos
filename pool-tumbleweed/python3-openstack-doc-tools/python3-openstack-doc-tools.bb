SUMMARY = "OpenStack Docs Tools"
DESCRIPTION = "Tools used by the OpenStack Documentation Project. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "python3-openstack-doc-tools-3.3.1-1.4.noarch.rpm"
RPM_HASH = "1a2b82dae4b3354f9e3537cee5b8c56cfea225dfd1c1c78314cf9112760bd9c7b9f1b0080b60ee3a5b7accfab37404589d6063b26499c64794c9a58e22087096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openstack-doc-tools \
python3.11dist-openstack-doc-tools \
python3dist-openstack-doc-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
python-abi \
python3-PyYAML \
python3-Sphinx \
python3-iso8601 \
python3-lxml \
python3-openstackdocstheme"

inherit rpm
