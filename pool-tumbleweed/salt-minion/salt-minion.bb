SUMMARY = "The client component for Saltstack"
DESCRIPTION = "Salt minion is queried and controlled from the master. \
Listens to the salt master and execute the commands."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-minion-3006.0-4.1.aarch64.rpm"
RPM_HASH = "9d1cf97033338236aa6132ba452642496d917e52a9ba14feb32f4c03c3db109e1e32a355091c6007d8eae1e62d56ce2fc3de9f163b5fb4682fac03638b7f8781"

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
