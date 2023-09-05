SUMMARY = "The management component of Saltstack with zmq protocol supported"
DESCRIPTION = "The Salt master is the central server to which all minions connect. \
Enabled commands to remote systems to be called in parallel rather \
than serially."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-master-3006.0-4.1.aarch64.rpm"
RPM_HASH = "f8b677b06158ea5998f9b3b10bd7ad8232aa47e1a6980c8e54cf893e8abf1486633548dea4841d1e2fca2471a7b780aa9f51cb239d3ee91cdf298728ab320aca"

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
