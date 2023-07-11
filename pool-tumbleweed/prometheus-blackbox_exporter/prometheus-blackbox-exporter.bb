SUMMARY = "Prometheus blackbox prober exporter"
DESCRIPTION = "Prometheus blackbox exporter allows blackbox probing of endpoints over HTTP, HTTPS, DNS, TCP and ICMP."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "prometheus-blackbox_exporter-0.24.0-2.1.aarch64.rpm"
RPM_HASH = "7599eb506c0d7241f5829db73f6e084df85c5bb7e78ab6884e07e3c8fd28213fec35d32fc99ef66bb02f0367197aeba874af9b896e0e6047f81e469a5c66ebe5"

RPROVIDES:${PN} += "config-prometheus-blackbox-exporter \
prometheus-blackbox-exporter"

RDEPENDS:${PN} += "/usr/bin/sh \
group-prometheus \
libc.so.6 \
permissions \
user-prometheus"

inherit rpm
