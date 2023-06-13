SUMMARY = "The syndic component for saltstack"
DESCRIPTION = "Salt syndic is the master-of-masters for salt \
The master of masters for salt-- it enables \
the management of multiple masters at a time.."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-syndic-3006.0-1.1.aarch64.rpm"
RPM_HASH = "1896a8b3c1f132501ebb1991cf338ef94d07ad564c017fe27248c85960d4cf416c34d8b21e6f30744129a3fc46addbe0066dc6150b2ee2905f1ff0f7950889bb"

RPROVIDES:${PN} += "salt-syndic \
salt-syndic(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/touch \
fillup \
salt \
salt-master \
systemd"

inherit rpm
