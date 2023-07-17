SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python310-netmiko-4.1.2-2.1.noarch.rpm"
RPM_HASH = "f9fa27362ddc7696a7ad7fd10b422f26cb8676b4c668aceb9e8a37c0686aa851d5df6017b0c03356d1c6406517415b9c7545de12967813ef4292b45e845433d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-netmiko \
python310-netmiko \
python3dist-netmiko"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-ntc-templates \
python310-paramiko \
python310-pyserial \
python310-scp \
python310-setuptools \
python310-tenacity \
python310-textfsm \
update-alternatives"

inherit rpm
