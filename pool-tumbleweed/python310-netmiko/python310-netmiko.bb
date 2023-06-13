SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python310-netmiko-4.1.2-1.4.noarch.rpm"
RPM_HASH = "46ec325281ed7340ff768b25a59e2f6a850d05f2ba48647e0c4f102bb9665b17cfcd9d168ed202073847d8cc0cd3eac5106ba481c817ec5c4984f9ff573a6fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netmiko \
python3.10dist(netmiko) \
python310-netmiko \
python3dist(netmiko)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyYAML \
python310-paramiko \
python310-pyserial \
python310-scp \
python310-tenacity \
python310-textfsm"

inherit rpm
