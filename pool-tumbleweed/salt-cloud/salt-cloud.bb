SUMMARY = "Generic cloud provisioning tool for Saltstack"
DESCRIPTION = "public cloud VM management system \
provision virtual machines on various public clouds via a cleanly \
controlled profile and mapping system."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-cloud-3006.0-4.1.aarch64.rpm"
RPM_HASH = "824a4e3534d387de6931b904f8876ac20b2d03c8b8275b8a17833803925bc01f050d8141dffde8c37f9e7b56ed82e3a970867507854ddbae45ee7b4c7327832c"

RPROVIDES:${PN} += "config-salt-cloud \
salt-cloud"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-apache-libcloud \
salt \
salt-master"

inherit rpm
