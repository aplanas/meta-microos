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

PV = "1.7.6"

RPM_NAME = "sqlmap-1.7.6-1.1.noarch.rpm"
RPM_HASH = "446f1dab2f85550d53e47b66f55dea6f980d36d6e0643e980b4791ea7f05c06e44f530c2aec08c47e140179633556ac171cd49971a4f9fb907a704599d08a623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlmap"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
python3"

inherit rpm
