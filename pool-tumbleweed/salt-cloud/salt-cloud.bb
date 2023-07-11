SUMMARY = "Generic cloud provisioning tool for Saltstack"
DESCRIPTION = "public cloud VM management system \
provision virtual machines on various public clouds via a cleanly \
controlled profile and mapping system."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-cloud-3006.0-1.4.aarch64.rpm"
RPM_HASH = "6b73f7da906d0e62a92268db6d807cbca73158801bdd0a577f31413ac97583134864b959604acb8eab3ac3c183bd1d80a6c686f8fed2467575c3ee9ce0e0e031"

RPROVIDES:${PN} += "config-salt-cloud \
salt-cloud"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-apache-libcloud \
salt \
salt-master"

inherit rpm
