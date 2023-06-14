SUMMARY = "Generic cloud provisioning tool for Saltstack"
DESCRIPTION = "public cloud VM management system \
provision virtual machines on various public clouds via a cleanly \
controlled profile and mapping system."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-cloud-3006.0-1.1.aarch64.rpm"
RPM_HASH = "cadb1bdadad91a846d51f41f22ab9b986e87421b2ece5859ae0d2675e43a21b5f9fee9424761e4b890f31166936879671dee9c327777e5281e54048998688927"

RPROVIDES:${PN} += "config-salt-cloud \
salt-cloud"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-apache-libcloud \
salt \
salt-master"

inherit rpm
