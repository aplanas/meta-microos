SUMMARY = "OpenStack Docs Theme"
DESCRIPTION = "Theme and extension support for Sphinx documentation that is published \
to docs.openstack.org. Intended for use by OpenStack projects."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python3-openstackdocstheme-3.1.1-1.1.noarch.rpm"
RPM_HASH = "400356635d01fc959fe0b6869cbdcd0512d7d29292ad26ab6a2413c548893355d66f668c1022224610e0fdb5412b9032574e0c245f7fc5a3773bce6ad637f5fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openstackdocstheme \
python3.11dist-openstackdocstheme \
python3dist-openstackdocstheme"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
python-abi \
python3-Sphinx \
python3-dulwich"

inherit rpm
