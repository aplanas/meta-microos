SUMMARY = "The management component of Saltstack with zmq protocol supported"
DESCRIPTION = "The Salt master is the central server to which all minions connect. \
Enabled commands to remote systems to be called in parallel rather \
than serially."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-master-3006.0-2.1.aarch64.rpm"
RPM_HASH = "484c2b03f61983ffafbfc8699a22f9d9bd8ad63be40f83b2a07eef7c73df8fe3bdbccccaba9a4cd7e320b289172c2cb2106b16cc5bfb796bff3eab403fdbfe0b"

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
