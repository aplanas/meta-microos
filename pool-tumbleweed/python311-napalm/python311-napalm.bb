SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "python311-napalm-4.0.0-2.4.noarch.rpm"
RPM_HASH = "cb653bdd6a4a9b85e9344cc78d6977aa0634475e6af777c2d8fee8e9e7fc268694ce951be09dda3f6cd7b633426f2bb40b71e5cc6842287eca14daed06eba486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-napalm \
python311-napalm \
python3dist-napalm"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-Jinja2 \
python311-PyYAML \
python311-cffi \
python311-ciscoconfparse \
python311-future \
python311-junos-eznc \
python311-lxml \
python311-ncclient \
python311-netaddr \
python311-netmiko \
python311-netutils \
python311-paramiko \
python311-pyeapi \
python311-requests \
python311-scp \
python311-setuptools \
python311-textfsm \
python311-ttp \
python311-ttp-templates \
python311-typing-extensions \
update-alternatives"

inherit rpm
