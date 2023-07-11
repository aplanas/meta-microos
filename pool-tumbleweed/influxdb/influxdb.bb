SUMMARY = "Scalable datastore for metrics, events, and real-time analytics"
DESCRIPTION = "InfluxDB is an distributed time series database with no external dependencies. \
It's useful for recording metrics, events, and performing analytics."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "influxdb-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "488a9f95e528bb10b7b3bcbc695cc7c917c9be94c18896dafaafe7767a93d546850abc5b06b727cec86b77ca5aa03367c9bd762481eba8b38c27db8b649e5758"

RPROVIDES:${PN} += "config-influxdb \
influxdb"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libflux.so.0.193.0 \
shadow"

inherit rpm
