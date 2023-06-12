SUMMARY = "Cockpit admin interface package for configuring and troubleshooting a system"
DESCRIPTION = "This package contains the Cockpit shell and system configuration interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-system-276.1-4.4.noarch.rpm"
RPM_HASH = "4c0ec8ca0cc50434fa0ec2589c77097abc55a4bffb9bf5164975d9c6b88164ac702a02c5c9c03a1362212e320e6530863a275c3e70fc251c723394c616daccf5"
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
