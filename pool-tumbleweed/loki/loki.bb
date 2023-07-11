SUMMARY = "Loki: like Prometheus, but for logs"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation system inspired by Prometheus. \
 \
This package contains the Loki server"
LICENSE = "Apache-2.0"

PV = "2.8.0+git.1680557182.90888a0c"

RPM_NAME = "loki-2.8.0+git.1680557182.90888a0c-1.3.aarch64.rpm"
RPM_HASH = "b998669111cd99e916aad31c93f36b60b58a18819425dbabb8e542b086e3d4b235bfb15d6fb7e21608778dca19e76b48dcf7d04f8896e5fca7b8d40d942fc9bb"

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
