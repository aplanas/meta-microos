SUMMARY = "Prometheus exporter for ICMP echo requests"
DESCRIPTION = "This is a simple server that scrapes go-ping stats and exports them via HTTP \
for Prometheus consumption."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "golang-github-czerwonk-ping_exporter-0.4.5-3.7.aarch64.rpm"
RPM_HASH = "f833195041ab2d792d4b34cd3ea7ba65ad71fca11e44b77d2305653c44f1a306ecb5c599dfcc0685da9baf44a73d7a42a624af6080293555e1e9fe2a21cfb296"

RPROVIDES:${PN} += "config-golang-github-czerwonk-ping-exporter \
golang-github-czerwonk-ping-exporter"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
libc.so.6"

inherit rpm
