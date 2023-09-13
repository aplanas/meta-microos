SUMMARY = "Cockpit admin interface package for configuring and troubleshooting a system"
DESCRIPTION = "This package contains the Cockpit shell and system configuration interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "300.1"

RPM_NAME = "cockpit-system-300.1-1.1.noarch.rpm"
RPM_HASH = "24e774252c931e84105eab35e08f87d3b00ef448c816217948b30e9c13c621d3886bfa8b147e3e593306cd5adb0752e3158720a2c33b2cf0176fe5e5c0122c66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-shell \
cockpit-system \
cockpit-systemd \
cockpit-tuned \
cockpit-users"

RDEPENDS:${PN} += "/usr/bin/date \
/usr/bin/pwscore \
cockpit-bridge \
grep"

inherit rpm
