SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python311-netmiko-4.2.0-1.1.noarch.rpm"
RPM_HASH = "ca1aaafb418a92dc592893cfe6cb21ab481710b7c1060e4f50336416367fe0356158ccf87303466240ffcb86308cafbef110b73bd6457a5558cb68c2719cebc7"
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
