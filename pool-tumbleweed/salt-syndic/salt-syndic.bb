SUMMARY = "The syndic component for saltstack"
DESCRIPTION = "Salt syndic is the master-of-masters for salt \
The master of masters for salt-- it enables \
the management of multiple masters at a time.."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-syndic-3006.0-2.1.aarch64.rpm"
RPM_HASH = "e3156c96d7bc38c2ee337de8975515894b680aa66891ae08c7a7fb652c7cb6d4e8e85acf0cbb333dd008e7df739fcdd850baa7b395363cc576bc22e9a67f3d42"

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
