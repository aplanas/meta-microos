SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python311-netmiko-4.1.2-2.1.noarch.rpm"
RPM_HASH = "aa35ab0ccdca35606f0d35c1152f3de482ef99c7aa450088a78ab9a6359b38b05b200ebf2fad5f8bc4995ef120c58d99ab4f0a63475891555588c9f907b21185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netmiko \
python3.11dist-netmiko \
python311-netmiko \
python3dist-netmiko"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-ntc-templates \
python311-paramiko \
python311-pyserial \
python311-scp \
python311-setuptools \
python311-tenacity \
python311-textfsm \
update-alternatives"

inherit rpm
