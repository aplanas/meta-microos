SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python39-netmiko-4.1.2-1.6.noarch.rpm"
RPM_HASH = "54f1db7550f2a135f84a37d9e522aa3c237e043687f5d30b0a7eb0465542e3aa546562db5ddb6564e9441a44752900f6c520b843057ae393d97d429c352c0dfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-netmiko \
python39-netmiko \
python3dist-netmiko"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-paramiko \
python39-pyserial \
python39-scp \
python39-tenacity \
python39-textfsm"

inherit rpm
