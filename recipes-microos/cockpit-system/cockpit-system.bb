SUMMARY = "Cockpit admin interface package for configuring and troubleshooting a system"
DESCRIPTION = "This package contains the Cockpit shell and system configuration interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-system-276.1-4.3.noarch.rpm"
RPM_HASH = "1d86e3adb7c4635960a310747996f56e40ed70a3b6074260037e364258978f32f4fcdac154d3395c4a935c855867dd346141ecb3f66e0ba2fbd943c3cf5f67f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-shell cockpit-system cockpit-systemd cockpit-tuned cockpit-users"
RDEPENDS:${PN} += "/usr/bin/date /usr/bin/pwscore cockpit-bridge grep"

inherit rpm
