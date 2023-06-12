SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python39-netmiko-4.1.2-1.4.noarch.rpm"
RPM_HASH = "e8c11dcbf006ae1735820ff25eac728bcd50e6ff2c6068e9449409b00d9d2efaa00fdedb16822925f30d3ef36f93c64ca6680a7da3351f181ac333f86b3acc1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(netmiko) \
python39-netmiko \
python3dist(netmiko)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyYAML \
python39-paramiko \
python39-pyserial \
python39-scp \
python39-tenacity \
python39-textfsm"

inherit rpm
