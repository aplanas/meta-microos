SUMMARY = "Cockpit component for Podman containers"
DESCRIPTION = "Cockpit component for managing Podman containers"
LICENSE = "LGPL-2.1-or-later"

PV = "74"

RPM_NAME = "cockpit-podman-74-1.1.noarch.rpm"
RPM_HASH = "94b027e66b8a64a5cff8610dcaee5789b692bb83142a414c77e92e5a1eceb7728a3577c28f11e050eec234f9830901933c7a5c1c0a501cf179022328b2633e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-podman"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
podman"

inherit rpm
