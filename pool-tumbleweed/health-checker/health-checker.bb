SUMMARY = "Service for verifying that important services are running"
DESCRIPTION = "health-checker is a service running once at every reboot to verify \
that all important services are running. If it is the first reboot after \
an update, an automatic rollback to the last working snapshot is made. \
If this is not after an update, a reboot is made. If this does not help, \
the services will be disabled. \
This package does not contain any checks. For this, additional \
plugins for different products are needed."
LICENSE = "GPL-2.0-only"

PV = "1.8"

RPM_NAME = "health-checker-1.8-1.1.noarch.rpm"
RPM_HASH = "5605bd24b2cfbaeda21afa509eb538a8b9b95113bcec10cf50e214ae1229a45b50ed742ead91477d5be9d219e0eec4e495cfa25541df214d13bfaecc0cc1999c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
health-checker-plugins"

inherit rpm
