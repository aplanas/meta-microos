SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python39-napalm-4.1.0-1.1.noarch.rpm"
RPM_HASH = "16f452514e7e7759fbec1ad8b6be82c378352f2f636c4579d3c555cac5ef7df8dca4930c8e597b078e479116ec7eea31f977be91c096ea015644c1ddf1bcc99f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-napalm \
python39-napalm \
python3dist-napalm"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-PyYAML \
python39-cffi \
python39-ciscoconfparse \
python39-future \
python39-junos-eznc \
python39-lxml \
python39-ncclient \
python39-netaddr \
python39-netmiko \
python39-netutils \
python39-paramiko \
python39-pyeapi \
python39-requests \
python39-scp \
python39-setuptools \
python39-textfsm \
python39-ttp \
python39-ttp-templates \
python39-typing-extensions \
update-alternatives"

inherit rpm
