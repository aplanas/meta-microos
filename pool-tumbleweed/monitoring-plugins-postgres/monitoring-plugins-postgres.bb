SUMMARY = "Postgres monitoring script using check_postgres.pl"
DESCRIPTION = "This package contains the symlinks to execute special checks via the standard \
monitoring plugins way."
LICENSE = "GPL-2.0-or-later"

PV = "2.26.0"

RPM_NAME = "monitoring-plugins-postgres-2.26.0-1.3.noarch.rpm"
RPM_HASH = "f402f8195b54edb3ab3a606e826980132dc1e3cf55a55b277e16d9c909903758403eff9d485fa9bb0203e18e44134cb1691c109f09b3d4146ec4e3af05f76a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-postgres \
monitoring-plugins-postgres \
nagios-plugins-postgres"

RDEPENDS:${PN} += "check-postgres"

inherit rpm
