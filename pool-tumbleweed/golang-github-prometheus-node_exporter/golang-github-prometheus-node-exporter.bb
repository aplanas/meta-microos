SUMMARY = "Prometheus exporter for machine metrics"
DESCRIPTION = "Prometheus exporter for hardware and OS metrics exposed by *NIX kernels, written in Go with pluggable metric collectors."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "golang-github-prometheus-node_exporter-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "17305dddff63c2afc50c63d77a568b1d8c31c9475c0955f4e09926a7aefcd0804764333eaca9841b551bbc5303fde6171c13a66abc91d5ddc6a64d68fea49c48"

RPROVIDES:${PN} += "golang-github-prometheus-node-exporter \
node-exporter \
prometheus-node-exporter"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
shadow"

inherit rpm
