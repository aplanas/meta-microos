SUMMARY = "Network Automation and Programmability Abstraction Layer"
DESCRIPTION = "NAPALM is a Python library that implements a set of functions to \
interact with different router vendor devices using a unified API."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "python39-napalm-4.0.0-2.4.noarch.rpm"
RPM_HASH = "714511180addd2d5c9e96c546ce1abc8cc241bc9d813645dbc33e921b1f08ef79091c12d67abccc8c83b3986097af14d7d69eb2aabc6b432ccbe2ba721438520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(napalm) \
python39-napalm \
python3dist(napalm)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
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
python39-typing_extensions \
update-alternatives"

inherit rpm
