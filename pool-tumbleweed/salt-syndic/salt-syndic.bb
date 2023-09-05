SUMMARY = "The syndic component for saltstack"
DESCRIPTION = "Salt syndic is the master-of-masters for salt \
The master of masters for salt-- it enables \
the management of multiple masters at a time.."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-syndic-3006.0-4.1.aarch64.rpm"
RPM_HASH = "91e0dc82711befa428fcb6503721300583999a0111ca41cc15546cd9898d465d391afc0a08c8359e1dfbe593ee13eaaa8a4d242c519b13b7e1038fd7c82e69ce"

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
