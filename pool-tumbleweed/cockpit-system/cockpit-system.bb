SUMMARY = "Cockpit admin interface package for configuring and troubleshooting a system"
DESCRIPTION = "This package contains the Cockpit shell and system configuration interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "293"

RPM_NAME = "cockpit-system-293-1.1.noarch.rpm"
RPM_HASH = "8739766ee81511ec3e0f9b7b23b7ad2b8fd2b051c2d8d4beabec60b654d3ecae2580d306eba62cc282100a4cb4f5c05f4a52bbc6e365313b16628a70b37bac6b"
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
