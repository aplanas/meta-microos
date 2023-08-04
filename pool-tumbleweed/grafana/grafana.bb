SUMMARY = "The open-source platform for monitoring and observability"
DESCRIPTION = "A graph and dashboard builder for visualizing time series metrics. \
 \
Grafana provides ways to create, explore, and share \
dashboards and data with teams."
LICENSE = "AGPL-3.0-only"

PV = "10.0.3"

RPM_NAME = "grafana-10.0.3-1.1.aarch64.rpm"
RPM_HASH = "f25b1e9a9c228868dcf03a226348976346644404e28a40e6010da970c07795527250a088551dc63d119ff0ff6b128be5456a769dd47598dbe36cda20ac90a75d"

RPROVIDES:${PN} += "config-grafana \
grafana"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-grafana \
libc.so.6 \
user-grafana"

inherit rpm
