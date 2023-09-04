SUMMARY = "Cockpit module for Agama"
DESCRIPTION = "Cockpit module for the experimental Agama installer."
LICENSE = "GPL-2.0-only"

PV = "3"

RPM_NAME = "cockpit-agama-3-1.1.noarch.rpm"
RPM_HASH = "bf33d8e16c21d077772416056693805ad9f2bb6cc1ddb43aa7ab46d62b3dc7d8bd8dd298960ebac1241e35f78842cfa33d48b0b3962e865daabe1305eaed986b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-agama"

RDEPENDS:${PN} += "cockpit"

inherit rpm
