SUMMARY = "OpenStack Docs Theme"
DESCRIPTION = "Theme and extension support for Sphinx documentation that is published \
to docs.openstack.org. Intended for use by OpenStack projects."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python3-openstackdocstheme-3.1.0-1.2.noarch.rpm"
RPM_HASH = "57ad572e8c872518bb24d485892ad335273586633afb49280b0b4c5758951548f790031c6f5df749f5188c0f8d40fd2cb90b1b4c658356fd993d8f43036540d9"
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
