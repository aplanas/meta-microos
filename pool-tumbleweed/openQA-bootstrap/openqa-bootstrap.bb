SUMMARY = "Automated openQA setup"
DESCRIPTION = "This can automatically setup openQA - either directly on your system \
or within a systemd-nspawn container."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689360748.edd4aa1"

RPM_NAME = "openQA-bootstrap-4.6.1689360748.edd4aa1-1.1.aarch64.rpm"
RPM_HASH = "3bd28ac668e1e1a5b6ef81b4c1ae1516101807b1a9fd86cc94b590a1edd54b58f512d0881bd2435c215a314112d49c679f2b137eb073414d2e102bd831506859"

RPROVIDES:${PN} += "openQA-bootstrap"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
