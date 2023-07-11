SUMMARY = "Postgres monitoring script using check_postgres.pl"
DESCRIPTION = "This package contains the symlinks to execute special checks via the standard \
monitoring plugins way."
LICENSE = "GPL-2.0-or-later"

PV = "2.26.0"

RPM_NAME = "monitoring-plugins-postgres-2.26.0-1.2.noarch.rpm"
RPM_HASH = "e1fbebe6424cc4642ff80f4422abb76427ac24406b6455a74219b385bd0aa62c770e6e53a2ad66c1b12892f6f9455295a61281bab2690c032e4e58952c1c8c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-postgres \
monitoring-plugins-postgres \
nagios-plugins-postgres"

RDEPENDS:${PN} += "check-postgres"

inherit rpm
