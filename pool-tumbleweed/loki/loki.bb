SUMMARY = "Loki: like Prometheus, but for logs"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation system inspired by Prometheus. \
 \
This package contains the Loki server"
LICENSE = "Apache-2.0"

PV = "2.8.0+git.1680557182.90888a0c"

RPM_NAME = "loki-2.8.0+git.1680557182.90888a0c-1.2.aarch64.rpm"
RPM_HASH = "b06abb6309338c8af4237836ed87aef0e1705ff5a0e964f2638db94894dcc79797269a8990c38dbcb584e80a90cfca844a2dbb9daabab7c1bfab815159f12202"

RPROVIDES:${PN} += "config-loki \
loki"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
group-loki \
logcli \
user-loki"

inherit rpm
