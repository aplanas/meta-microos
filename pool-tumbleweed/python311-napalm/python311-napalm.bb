SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python311-napalm-4.1.0-2.1.noarch.rpm"
RPM_HASH = "763093c1eb0e8f75a8987acde684eb0f09c3d141e8d4a153a60bb8cc41e2c7959455ed347bb8774a553bfbaae789c4a2ed423f46469f1bccbf2efc377cfab135"
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
