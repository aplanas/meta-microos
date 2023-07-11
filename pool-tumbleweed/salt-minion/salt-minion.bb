SUMMARY = "The client component for Saltstack"
DESCRIPTION = "Salt minion is queried and controlled from the master. \
Listens to the salt master and execute the commands."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-minion-3006.0-1.4.aarch64.rpm"
RPM_HASH = "21c254d116a5f8ed6b217a6cf5678f39127811bf68ab7669fa58218a9bbc22d1754d93e39c92867569b7b0fcd9b2dc5f53780342b50547059290bb1eac4ae349"

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
