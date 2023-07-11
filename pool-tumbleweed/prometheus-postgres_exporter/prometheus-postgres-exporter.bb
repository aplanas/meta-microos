SUMMARY = "Prometheus exporter for PostgreSQL"
DESCRIPTION = "Prometheus exporter for PostgreSQL server metrics. Supported PostgreSQL versions: 9.1 and up."
LICENSE = "Apache-2.0"

PV = "0.10.1"

RPM_NAME = "prometheus-postgres_exporter-0.10.1-3.3.aarch64.rpm"
RPM_HASH = "ca93c728e017a28fd9b9139cac269674328b531f9c6a716157d7a1c54c4aae77719d8ac62d4d156872225b51377393df60975cb78fc557f761bb5c2ba084ce2d"

RPROVIDES:${PN} += "golang-github-wrouesnel-postgres-exporter \
prometheus-postgres-exporter"

RDEPENDS:${PN} += "/usr/bin/sh \
group-prometheus \
shadow \
systemd \
user-prometheus"

inherit rpm
