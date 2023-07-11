SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python311-netmiko-4.1.2-1.6.noarch.rpm"
RPM_HASH = "61e00e396f1831973bc16241c663086416ee9ba287ecac3211cf27c2d3087bd380eda50448d3ff93724bb52b2dfc64aaa4abce0f77612b10cab9e504175ad95b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netmiko \
python3.11dist-netmiko \
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
