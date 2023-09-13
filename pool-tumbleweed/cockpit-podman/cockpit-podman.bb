SUMMARY = "Cockpit component for Podman containers"
DESCRIPTION = "Cockpit component for managing Podman containers"
LICENSE = "LGPL-2.1-or-later"

PV = "76"

RPM_NAME = "cockpit-podman-76-1.1.noarch.rpm"
RPM_HASH = "42ca3ca58ca8683c6297485c6d771a77de247782affc0a4e0711a16f901f961b143abde31143fa67b1514cd6e89c021ea972ffef5ecd0849b890fe19ed7d4e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-podman"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
podman"

inherit rpm
