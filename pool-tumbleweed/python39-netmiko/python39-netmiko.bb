SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python39-netmiko-4.1.2-2.1.noarch.rpm"
RPM_HASH = "c00fa517d91dc61cd1b0faca00b6d139e273bfc4a81f9dec8082b546ccce57c8e8af549ca5600d3abe4f808f452d4d5d7ef9d3dcb44fc85ae607fdad946c23de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-netmiko \
python39-netmiko \
python3dist-netmiko"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-ntc-templates \
python39-paramiko \
python39-pyserial \
python39-scp \
python39-setuptools \
python39-tenacity \
python39-textfsm \
update-alternatives"

inherit rpm
