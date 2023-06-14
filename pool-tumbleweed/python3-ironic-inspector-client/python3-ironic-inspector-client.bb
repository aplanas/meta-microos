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

RPM_NAME = "python3-ironic-inspector-client-4.7.0-1.4.noarch.rpm"
RPM_HASH = "4155e74901649c911c81247c6a741c9abbd7688399b50a903f89a57e5e6a4661327889ff0f73d677fe722afeaf65ffd96ce6828fb723fdb27183489d50267322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ironic-inspector-client \
python3.10dist-python-ironic-inspector-client \
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
