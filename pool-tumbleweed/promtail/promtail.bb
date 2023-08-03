SUMMARY = "Promtail Client"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation system inspired by Prometheus. \
 \
This package contains the Promtail client."
LICENSE = "Apache-2.0"

PV = "2.8.3+git.1689949088.0d81144c"

RPM_NAME = "promtail-2.8.3+git.1689949088.0d81144c-1.1.aarch64.rpm"
RPM_HASH = "69358ac49a8b0a6b74e327df5fb8ca8b6fdde7dd39a9e6fc3244a08deb61cea96867143642a2ae0cc92081b6cf72e8e0be8bcd07da8defef8c32d0753ebdf8ff"

RPROVIDES:${PN} += "config-promtail \
promtail"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
