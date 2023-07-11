SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "python311-napalm-4.0.0-2.6.noarch.rpm"
RPM_HASH = "88ee2c7cf1f2cce3381a99dead1cafa389c8eaff70eb6f1fc5ddcb9c47c787507ffee03e65e1660c0ba59695fa8bfbaf3448f91d2910f4d9e24e92b6ebfaa5bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-napalm \
python3.11dist-napalm \
python311-napalm \
python3dist-napalm"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
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
