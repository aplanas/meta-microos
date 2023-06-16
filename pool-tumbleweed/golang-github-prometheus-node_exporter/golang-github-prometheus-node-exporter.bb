SUMMARY = "Prometheus exporter for machine metrics"
DESCRIPTION = "Prometheus exporter for hardware and OS metrics exposed by *NIX kernels, written in Go with pluggable metric collectors."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "golang-github-prometheus-node_exporter-1.5.0-4.2.aarch64.rpm"
RPM_HASH = "9155c48859eb3bb1d3e91c7720c088696dac97059de9f510e71b9dab922332317e2df12c07085d970d783850633ebf8dcee34b5630854169ace3562a1422f598"

RPROVIDES:${PN} += "golang-github-prometheus-node-exporter \
node-exporter \
prometheus-node-exporter"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
shadow"

inherit rpm
