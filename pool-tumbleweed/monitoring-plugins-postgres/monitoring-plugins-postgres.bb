SUMMARY = "Postgres monitoring script using check_postgres.pl"
DESCRIPTION = "This package contains the symlinks to execute special checks via the standard \
monitoring plugins way."
LICENSE = "GPL-2.0-or-later"

PV = "2.26.0"

RPM_NAME = "monitoring-plugins-postgres-2.26.0-1.1.noarch.rpm"
RPM_HASH = "a305bf9c4f2cac04dcd93057e9870a8867ad17305863aa58e63b8f836fdf83bbd247a0242c9271b9696c7d90c90736e83684e5a4dfc38aa0a8568d268d036eae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-postgres \
monitoring-plugins-postgres \
nagios-plugins-postgres"

RDEPENDS:${PN} += "check-postgres"

inherit rpm
