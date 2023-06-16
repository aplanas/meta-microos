SUMMARY = "Automatic SQL injection and database takeover tool"
DESCRIPTION = " \
sqlmap is an open source penetration testing tool that automates the process of \
detecting and exploiting SQL injection flaws and taking over of database \
servers. It comes with a powerful detection engine, many niche features for the \
ultimate penetration tester, and a broad range of switches including database \
fingerprinting, over data fetching from the database, accessing the underlying \
file system, and executing commands on the operating system via out-of-band \
connections."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.2"

RPM_NAME = "sqlmap-1.7.2-1.2.noarch.rpm"
RPM_HASH = "449090224ced235d92d27f20c807673ad3409337dea5de90f63495bc5658ce6b6a58c78125c349a4174d84772101dcc085aec38f5a511369ed1874fac8189dda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlmap"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
python3"

inherit rpm
