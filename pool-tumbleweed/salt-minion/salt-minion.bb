SUMMARY = "The client component for Saltstack"
DESCRIPTION = "Salt minion is queried and controlled from the master. \
Listens to the salt master and execute the commands."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-minion-3006.0-1.1.aarch64.rpm"
RPM_HASH = "0221097ebbb79c11dd2e67e189513074e3c789e416f2d53130938a4858387137c280183cfab29605d94e615a50c094f43486433cbf30d8141d9663122060b7ba"

RPROVIDES:${PN} += "config-salt-minion \
salt-minion"

RDEPENDS:${PN} += "-salt-transactional-update = 3006.0-1.1 if read-only-root-fs \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/touch \
fillup \
salt \
systemd"

inherit rpm
