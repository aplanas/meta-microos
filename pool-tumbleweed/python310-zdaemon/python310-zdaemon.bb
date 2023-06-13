SUMMARY = "Daemon process control library and tools"
DESCRIPTION = "zdaemon is a Python package which provides APIs for managing \
applications run as daemons. Its principal use to date has been to \
manage the application server and storage server daemons for Zope / ZEO, \
although it is not limited to running Python-based applications"
LICENSE = "ZPL-2.1"

PV = "4.4"

RPM_NAME = "python310-zdaemon-4.4-1.4.noarch.rpm"
RPM_HASH = "4152de72656acbced3431bc40678728428b304f6baef867387602b67b02bae82759f0cacdc6a84de598855b699bed4041befcf00501b8a1c817754602c4219dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zdaemon \
python3.10dist(zdaemon) \
python310-zdaemon \
python3dist(zdaemon)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-ZConfig \
update-alternatives"

inherit rpm
