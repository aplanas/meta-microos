SUMMARY = "The client component for Saltstack"
DESCRIPTION = "Salt minion is queried and controlled from the master. \
Listens to the salt master and execute the commands."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-minion-3006.0-2.1.aarch64.rpm"
RPM_HASH = "72491bb49b95bca372a8f1576954e336d01d06210042587ae13f87281c47445a81c2415a8982a863edf72acfd12c112821db06519128b4258bbfde65702ef392"

RPROVIDES:${PN} += "config-salt-minion \
salt-minion"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
salt \
systemd"

inherit rpm
