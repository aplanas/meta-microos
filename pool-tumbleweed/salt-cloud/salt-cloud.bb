SUMMARY = "Generic cloud provisioning tool for Saltstack"
DESCRIPTION = "public cloud VM management system \
provision virtual machines on various public clouds via a cleanly \
controlled profile and mapping system."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-cloud-3006.0-2.1.aarch64.rpm"
RPM_HASH = "534a2cbd1e2182dc0c63203d5a567936b93b82a4ab6ab6e27f6565247e6b967c0f46d312fd54ccad7dde77f142b22761ecb4062ca62b12448be9df88bcbf8098"

RPROVIDES:${PN} += "config-salt-cloud \
salt-cloud"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-apache-libcloud \
salt \
salt-master"

inherit rpm
