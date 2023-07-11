SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "python39-napalm-4.0.0-2.6.noarch.rpm"
RPM_HASH = "a372bb2398755f0dd0043faf2d19b94b17fa4663f5d69ef0f7165d4ba856e3a7c46f776392eb518101df93091de094fcf83755b84f3b0b7c4a9bc78af59198f3"
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
