SUMMARY = "The syndic component for saltstack"
DESCRIPTION = "Salt syndic is the master-of-masters for salt \
The master of masters for salt-- it enables \
the management of multiple masters at a time.."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-syndic-3006.0-1.4.aarch64.rpm"
RPM_HASH = "a5cb05b0250a342bda1cb15bc4775403518d1c61ba23dde741397df0d1297a08e1577aa01f384e8aafd6f9978ffe8ad1220dc4c8f785cebb851fac91d9868003"

RPROVIDES:${PN} += "salt-syndic"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
salt \
salt-master \
systemd"

inherit rpm
