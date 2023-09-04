SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python310-netmiko-4.2.0-1.1.noarch.rpm"
RPM_HASH = "b9ba062f85cf9def18f45940468c3e2550559eaf87dd082455084873fd1d26f34ab6c87ef39d5bb88f8ba81dcf208504379bd9a09f742ba2a506afc2c10aecd6"
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
