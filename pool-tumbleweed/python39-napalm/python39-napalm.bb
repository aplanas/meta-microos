SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python39-napalm-4.1.0-2.1.noarch.rpm"
RPM_HASH = "bcbb609687c3489ddafd552d35c4a70475d5a85c267897a5b6a8081b1145dd9dd9912bc06488ed7f697af99383b57bdee1430576eed76e1b2f6f0c14131bc10c"
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
