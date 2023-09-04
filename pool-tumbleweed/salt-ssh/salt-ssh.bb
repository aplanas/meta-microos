SUMMARY = "Management component for Saltstack with ssh protocol"
DESCRIPTION = "Salt ssh is a master running without zmq. \
it enables the management of minions over a ssh connection."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-ssh-3006.0-2.1.aarch64.rpm"
RPM_HASH = "9f7f76d84d78594c9208e11d81dfa20b28b96462cfba898820a99a1fd053de43c19e6226d2374dc21d5153731677438adf0e4dba6a171b80b0323b9a9d93a2aa"

RPROVIDES:${PN} += "salt-ssh"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/touch \
fillup \
salt \
salt-master \
systemd"

inherit rpm
