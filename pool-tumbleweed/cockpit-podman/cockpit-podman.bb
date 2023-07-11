SUMMARY = "Cockpit component for Podman containers"
DESCRIPTION = "Cockpit component for managing Podman containers"
LICENSE = "LGPL-2.1-or-later"

PV = "70"

RPM_NAME = "cockpit-podman-70-1.1.noarch.rpm"
RPM_HASH = "2ef51fca610dc9e8559f98ad0f6499f535a33253a3b04fa2dbeb87e6c5ab5f9ac4b0e8488de9175b36b3e5e0497aaff9b2f8cfde9c8196b42f3e3f85e003061c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-podman"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
podman"

inherit rpm
