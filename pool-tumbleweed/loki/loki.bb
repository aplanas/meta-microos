SUMMARY = "Loki: like Prometheus, but for logs"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation system inspired by Prometheus. \
 \
This package contains the Loki server"
LICENSE = "Apache-2.0"

PV = "2.8.3+git.1689949088.0d81144c"

RPM_NAME = "loki-2.8.3+git.1689949088.0d81144c-1.1.aarch64.rpm"
RPM_HASH = "5c9ab0cffb34b9bdf631176049d38f1bf0733f988b86f433014392360630056453e1627e0455bf31abb7cad5176898e6a6fa3efe4028a031be6eb89aab5a97f3"

RPROVIDES:${PN} += "config-loki \
loki"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-loki \
logcli \
user-loki"

inherit rpm
