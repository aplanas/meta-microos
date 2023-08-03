SUMMARY = "Scalable datastore for metrics, events, and real-time analytics"
DESCRIPTION = "InfluxDB is an distributed time series database with no external dependencies. \
It's useful for recording metrics, events, and performing analytics."
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "influxdb-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "60d533da6d367f230247f7aa178d920232b18da51328c46339d9df76432066303cde67494b525a48548d493af85348ea74d5f9c7116ccbda53ad6ffd83f67478"

RPROVIDES:${PN} += "config-influxdb \
influxdb"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libflux.so.0.193.0 \
shadow"

inherit rpm
