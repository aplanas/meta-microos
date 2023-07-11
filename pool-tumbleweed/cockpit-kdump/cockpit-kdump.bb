SUMMARY = "Cockpit user interface for kernel crash dumping"
DESCRIPTION = "The Cockpit component for configuring kernel crash dumping."
LICENSE = "LGPL-2.1-or-later"

PV = "293"

RPM_NAME = "cockpit-kdump-293-1.1.noarch.rpm"
RPM_HASH = "95c6973d1c48eccabf306912516a6cb26f982bec21ff10f8f10f711dff8bf971a4da57d15db4127e320946f4e295423122207626f1909d31edf2c38f61533fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-kdump"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
kexec-tools"

inherit rpm
