SUMMARY = "Prometheus exporter for PostgreSQL"
DESCRIPTION = "Prometheus exporter for PostgreSQL server metrics. Supported PostgreSQL versions: 9.1 and up."
LICENSE = "Apache-2.0"

PV = "0.10.1"

RPM_NAME = "prometheus-postgres_exporter-0.10.1-3.2.aarch64.rpm"
RPM_HASH = "30af7970aec8fa8884aabb31a0c0b77b04cc7b9582084f0578cba6f8595eaf889195e532f6db206d335c709d6943b59f7caa310779742b2f0e0426a1f2fb2d76"

RPROVIDES:${PN} += "golang-github-wrouesnel-postgres-exporter \
prometheus-postgres-exporter"

RDEPENDS:${PN} += "/usr/bin/sh \
group-prometheus \
shadow \
systemd \
user-prometheus"

inherit rpm
