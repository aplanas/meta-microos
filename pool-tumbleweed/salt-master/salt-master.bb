SUMMARY = "The management component of Saltstack with zmq protocol supported"
DESCRIPTION = "The Salt master is the central server to which all minions connect. \
Enabled commands to remote systems to be called in parallel rather \
than serially."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-master-3006.0-1.4.aarch64.rpm"
RPM_HASH = "a9e03d330b57f765a10a6de86088e596364611849e719e05e3002ba1179f87fd9fb008000d745be6d5e9b906ea5c33febaaa09c62502fc6f89ce4b1c6e32d7cd"

RPROVIDES:${PN} += "config-salt-master \
salt-master"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
salt \
systemd"

inherit rpm
