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

RPM_NAME = "python3-ironic-inspector-client-4.7.0-1.5.noarch.rpm"
RPM_HASH = "f9c7940d27e09637bbe2543db7afab1e0df0fe01bff60792c7ec77ac9975d1cd0268158d7dd757554592a590eaa03daae707bd16ce02d74734862cf800107154"
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
