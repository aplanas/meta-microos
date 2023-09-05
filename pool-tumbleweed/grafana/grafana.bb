SUMMARY = "The open-source platform for monitoring and observability"
DESCRIPTION = "A graph and dashboard builder for visualizing time series metrics. \
 \
Grafana provides ways to create, explore, and share \
dashboards and data with teams."
LICENSE = "AGPL-3.0-only"

PV = "10.1.0"

RPM_NAME = "grafana-10.1.0-1.1.aarch64.rpm"
RPM_HASH = "85c913e92f16cf171eb57a2599018e87d16b842f64402c6162190c149df72d6cbd4554af19cfd800719e55bb12929c0e338b8bce0afc1e38e246c5d41f454e53"

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
