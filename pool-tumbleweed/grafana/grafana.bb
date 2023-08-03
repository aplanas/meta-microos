SUMMARY = "The open-source platform for monitoring and observability"
DESCRIPTION = "A graph and dashboard builder for visualizing time series metrics. \
 \
Grafana provides ways to create, explore, and share \
dashboards and data with teams."
LICENSE = "AGPL-3.0-only"

PV = "10.0.2"

RPM_NAME = "grafana-10.0.2-1.1.aarch64.rpm"
RPM_HASH = "8777ab52c37828eb4299cf49af83c14acf2214e80c2c2e7eeec5197aede62f8359e4f37a17f178b8890c339602d57025d542e1a108af73238853e3d96a3c85f9"

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
