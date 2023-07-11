SUMMARY = "Prometheus exporter for ICMP echo requests"
DESCRIPTION = "This is a simple server that scrapes go-ping stats and exports them via HTTP \
for Prometheus consumption."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "golang-github-czerwonk-ping_exporter-0.4.5-3.8.aarch64.rpm"
RPM_HASH = "50ffd4633fdd05fd701fe6c74d873f9ee1fae4f928416739c9bd38b16f48b04b2e758d0b7b1fa1075a6abcc67cad0db450af07266d4fef7e63330739d3bce894"

RPROVIDES:${PN} += "config-golang-github-czerwonk-ping-exporter \
golang-github-czerwonk-ping-exporter"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6"

inherit rpm
