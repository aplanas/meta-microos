SUMMARY = "Promtail Client"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation system inspired by Prometheus. \
 \
This package contains the Promtail client."
LICENSE = "Apache-2.0"

PV = "2.8.0+git.1680557182.90888a0c"

RPM_NAME = "promtail-2.8.0+git.1680557182.90888a0c-1.3.aarch64.rpm"
RPM_HASH = "032bc4c52fe3103dc64bfad3415c060e541910b426f56bfd5f601f29842d25785a529147e1a0c17e7874a5e87ea9802cb9bb832a7d25e795f7bf6131807a33a1"

RPROVIDES:${PN} += "config-promtail \
promtail"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
