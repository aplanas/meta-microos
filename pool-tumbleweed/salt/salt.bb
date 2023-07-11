SUMMARY = "A parallel remote execution system"
DESCRIPTION = "Salt is a distributed remote execution system used to execute commands and \
query data. It was developed in order to bring the best solutions found in \
the world of remote execution together and make them better, faster and more \
malleable. Salt accomplishes this via its ability to handle larger loads of \
information, and not just dozens, but hundreds or even thousands of individual \
servers, handle them quickly and through a simple and manageable interface."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-3006.0-1.4.aarch64.rpm"
RPM_HASH = "89d63273e193133b87b57d50b78d2264f82a5ff2b3bfec18ab721e8724d022ef9877589ca6dfb213565cd85112251ece86d5c192795d0665cc19101d1a6a9c93"

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
