SUMMARY = "Cockpit admin interface package for configuring and troubleshooting a system"
DESCRIPTION = "This package contains the Cockpit shell and system configuration interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-system-298-2.1.noarch.rpm"
RPM_HASH = "2b64732f200ca92f5fd8c27e74ee0f6f3104d9dcefe02e05d8f9f18b5d1d8167f1405ef47de1b7894a801f5662efa26b74ccde8af8ad8011fb115349b5b5ad29"
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
