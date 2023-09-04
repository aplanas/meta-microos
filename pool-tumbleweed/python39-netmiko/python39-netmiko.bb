SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python39-netmiko-4.2.0-1.1.noarch.rpm"
RPM_HASH = "df0cbb26239bf59230c70e34b6d6d43e244578bc8e8688b5bcef8e544fd3488273568b6288d5bba56548a02c97aa7da5071ceed171aedb15f79a99fb487757a1"
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
