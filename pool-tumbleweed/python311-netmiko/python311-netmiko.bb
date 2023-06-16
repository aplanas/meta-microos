SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python311-netmiko-4.1.2-1.4.noarch.rpm"
RPM_HASH = "38350e754a63ea709dfe0b70ed772df4e5fbedb2b013423cb1bb5d4b02fbcee4ab0cc3b1227cb6fa5d8e430d54a45719d5f5eb74e6888325b273475d48a93e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-netmiko \
python311-netmiko \
python3dist-netmiko"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-paramiko \
python311-pyserial \
python311-scp \
python311-tenacity \
python311-textfsm"

inherit rpm
