SUMMARY = "Python client and CLI tool for Ironic Inspector"
DESCRIPTION = "Ironic Inspector is an auxiliary service for discovering hardware properties \
for a node managed by OpenStack Ironic. Hardware introspection or hardware \
properties discovery is a process of getting hardware parameters required for \
scheduling from a bare metal node, given its power management credentials \
(e.g. IPMI address, user name and password). \
 \
This package contains Python client and command line tool for Ironic Inspector. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.7.0"

RPM_NAME = "python3-ironic-inspector-client-4.7.0-1.6.noarch.rpm"
RPM_HASH = "b7e604146e212e1683852fe77b6ffe92e9f7f90475aec5cdc65bcc2e800864dd80c8282e6803d928efb855d580d311113e4098e5d2e3b6e4302cd95c72ba8919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ironic-inspector-client \
python3.11dist-python-ironic-inspector-client \
python3dist-python-ironic-inspector-client"

RDEPENDS:${PN} += "python-abi \
python3-PyYAML \
python3-keystoneauth1 \
python3-openstackclient \
python3-osc-lib \
python3-oslo.i18n \
python3-oslo.utils \
python3-requests"

inherit rpm
