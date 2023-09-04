SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python311-napalm-4.1.0-1.1.noarch.rpm"
RPM_HASH = "5b60e70778dfde443e1349a2e2140ad3d0961d7c951adfc78b2785cde51c84023073e48946db2a83c222f3931f74c907c25fa24240af1ad9c61321e6b6d6b46f"
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
