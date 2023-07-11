SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "python310-napalm-4.0.0-2.6.noarch.rpm"
RPM_HASH = "07bb52b703e0f80550c1751bff8948f3fcd35f905a665ae4fa23a7b92f31b6e49eacc1fe5ef7ea35f16dae5520f1719dba6fa51c4ca0f823cac2f7e004d81416"
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
