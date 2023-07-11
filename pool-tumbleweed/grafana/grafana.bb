SUMMARY = "The open-source platform for monitoring and observability"
DESCRIPTION = "A graph and dashboard builder for visualizing time series metrics. \
 \
Grafana provides ways to create, explore, and share \
dashboards and data with teams."
LICENSE = "AGPL-3.0-only"

PV = "10.0.1"

RPM_NAME = "grafana-10.0.1-2.1.aarch64.rpm"
RPM_HASH = "1ddad36b47e9e77877e5e81fe5476dcf41a3d688478f1f56710d5823c0f8f2f6f3a40ea22c1914eb6ab38103bda23ca0aac99193a044f1f7545b524949e79d62"

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
