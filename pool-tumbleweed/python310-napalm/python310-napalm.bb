SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python310-napalm-4.1.0-1.1.noarch.rpm"
RPM_HASH = "5f6e01fbe76fbb899695cc24f02f8e5ca88ab77ca8d5625335accc79b440f928b0eb69492a2d8ae0394f3c488ed9ac4c199168935279669cbf0ebcab93699ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-napalm \
python310-napalm \
python3dist-napalm"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Jinja2 \
python310-PyYAML \
python310-cffi \
python310-ciscoconfparse \
python310-future \
python310-junos-eznc \
python310-lxml \
python310-ncclient \
python310-netaddr \
python310-netmiko \
python310-netutils \
python310-paramiko \
python310-pyeapi \
python310-requests \
python310-scp \
python310-setuptools \
python310-textfsm \
python310-ttp \
python310-ttp-templates \
python310-typing-extensions \
update-alternatives"

inherit rpm
