SUMMARY = "A parallel remote execution system"
DESCRIPTION = "Salt is a distributed remote execution system used to execute commands and \
query data. It was developed in order to bring the best solutions found in \
the world of remote execution together and make them better, faster and more \
malleable. Salt accomplishes this via its ability to handle larger loads of \
information, and not just dozens, but hundreds or even thousands of individual \
servers, handle them quickly and through a simple and manageable interface."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-3006.0-2.1.aarch64.rpm"
RPM_HASH = "f889845644081665b37aa49b6afeeaaff3df2d74cd36c1863359583718a69234e8daa1f884e2bbb1740b30b74683209f7a3691e3f0ed5023d2ab8bac82cb2994"

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
