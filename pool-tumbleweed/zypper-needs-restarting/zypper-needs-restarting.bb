SUMMARY = "needs-restarting compatibility with zypper"
DESCRIPTION = "provides compatibility to YUM needs-restarting command using zypper \
 \
Authors: \
-------- \
    Michael Andres <ma@suse.de>"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.61"

RPM_NAME = "zypper-needs-restarting-1.14.61-1.1.noarch.rpm"
RPM_HASH = "1e005e99e6d7d4f18cf3782b2e079fef83ea60253f3d0736c5b74e6f82f46d2a4b3cf4dea7a4a952493a9f9be9256651f7957afffe96b62276a779270e6fd8f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-needs-restarting"

RDEPENDS:${PN} += "/usr/bin/bash \
zypper"

inherit rpm
