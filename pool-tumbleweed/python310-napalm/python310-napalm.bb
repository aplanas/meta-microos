SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python310-napalm-4.1.0-2.1.noarch.rpm"
RPM_HASH = "e9112bb56c6e4c85f848bb635ae7c16321eff45b483ee913b39c1b47c941f0e773201560887cda9ef3b3b40cb86c9c91ad91a4a54c6a9d75eff8b452eb14c4b3"
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
