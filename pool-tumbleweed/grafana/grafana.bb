SUMMARY = "The open-source platform for monitoring and observability"
DESCRIPTION = "A graph and dashboard builder for visualizing time series metrics. \
 \
Grafana provides ways to create, explore, and share \
dashboards and data with teams."
LICENSE = "AGPL-3.0-only"

PV = "9.5.2"

RPM_NAME = "grafana-9.5.2-1.1.aarch64.rpm"
RPM_HASH = "8c0e9d95c3588a3eba8ad275b0410609ce794343d70192a65ab6fae4154fd35529b2fe6cfac2aaa667785aa735a71f4fec5ae32cec91ebd665240fa0f68acb05"

RPROVIDES:${PN} += "config(grafana) \
grafana \
grafana(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
group(grafana) \
libc.so.6()(64bit) \
user(grafana)"

inherit rpm
