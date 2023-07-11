SUMMARY = "Management component for Saltstack with ssh protocol"
DESCRIPTION = "Salt ssh is a master running without zmq. \
it enables the management of minions over a ssh connection."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-ssh-3006.0-1.4.aarch64.rpm"
RPM_HASH = "52d4de39ece24a880ad7b123f1bcaa1100c1c044857c3c85eecf427c14454b300d20d9e06cbc87df4f4786721c86991920636244f0f4fdd17cb04222cf102d54"

RPROVIDES:${PN} += "salt-ssh"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/touch \
fillup \
salt \
salt-master \
systemd"

inherit rpm
