SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python310-netmiko-4.1.2-1.6.noarch.rpm"
RPM_HASH = "30a816f2418d641604e18d4b181bb42be89448e61b821853dc6a4035c2ad0bfb675c6aeee6a28c65190131c920606bd4d16699964977bec98e638c9c1f15593e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-netmiko \
python310-netmiko \
python3dist-netmiko"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-paramiko \
python310-pyserial \
python310-scp \
python310-tenacity \
python310-textfsm"

inherit rpm
