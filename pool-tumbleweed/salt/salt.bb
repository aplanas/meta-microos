SUMMARY = "A parallel remote execution system"
DESCRIPTION = "Salt is a distributed remote execution system used to execute commands and \
query data. It was developed in order to bring the best solutions found in \
the world of remote execution together and make them better, faster and more \
malleable. Salt accomplishes this via its ability to handle larger loads of \
information, and not just dozens, but hundreds or even thousands of individual \
servers, handle them quickly and through a simple and manageable interface."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-3006.0-1.1.aarch64.rpm"
RPM_HASH = "7b7313e558cc9cb436f46321acc02fd09c94515ffc05f6b14b24c717e86820267218b52a20c0e6f09b244fbd0a52e1de3f53fd0fda036e0c5817d50a6b0154d1"

RPROVIDES:${PN} += "config-salt \
salt"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
/usr/sbin/groupadd \
/usr/sbin/useradd \
dbus-1 \
fillup \
iproute2 \
logrotate \
procps \
python3-salt \
shadow"

inherit rpm
