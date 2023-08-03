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

PV = "1.7.7"

RPM_NAME = "sqlmap-1.7.7-1.1.noarch.rpm"
RPM_HASH = "2973603bb4f4de1774b9f0a6fa98aa0a0702f621883f68b1f9e5f022d5201abca27ba71e44eb93c061e311156a714f6a60c84b065105741acf4a23dfc203e954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlmap"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
python3"

inherit rpm
