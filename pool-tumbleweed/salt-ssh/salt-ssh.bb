SUMMARY = "Management component for Saltstack with ssh protocol"
DESCRIPTION = "Salt ssh is a master running without zmq. \
it enables the management of minions over a ssh connection."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-ssh-3006.0-4.1.aarch64.rpm"
RPM_HASH = "e467916e62102f6d4c6a009d3922bbd16465c17e81e818cfcac6824d4ef09cd811262231669ffef7721cbe89dda71af5649f1cc40c7fadf50e67ba4564a90148"

RPROVIDES:${PN} += "salt-ssh"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/touch \
fillup \
salt \
salt-master \
systemd"

inherit rpm
