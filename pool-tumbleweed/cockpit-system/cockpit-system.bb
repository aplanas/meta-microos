SUMMARY = "Cockpit admin interface package for configuring and troubleshooting a system"
DESCRIPTION = "This package contains the Cockpit shell and system configuration interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-system-298-1.1.noarch.rpm"
RPM_HASH = "4744ed97bdaa1581d94f541440c457781ffa97c08ef5aef02e5d4083b81bc7e47f6736c196ae836adc761603c1a7477e8cd72eb2f10de57a90b87f7d2e1b7175"
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
