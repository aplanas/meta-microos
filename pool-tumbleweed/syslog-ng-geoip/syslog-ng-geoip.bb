SUMMARY = "GeoIP (MaxMindDB) support for syslog-ng"
DESCRIPTION = "This package provides GeoIP (MaxMindDB) modules providing support for \
logging geo-location information."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-geoip-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "ff0638007c4837ce6ad392e9e09bf27b8848f641b71420b507a650a3792f212830285c10dd9b03753530486c9532831e8030dacac8a6d6c0bc14e2e9ecbe8dea"

RPROVIDES:${PN} += "syslog-ng-geoip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
