SUMMARY = "GeoIP (MaxMindDB) support for syslog-ng"
DESCRIPTION = "This package provides GeoIP (MaxMindDB) modules providing support for \
logging geo-location information."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-geoip-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "536ec76aa329188f60f536763356fdf9cf98308efe7dea85a8a366013ae15a59de6130756536293bfbd458bdd11a56e54b3faa833c3a9d6d5c08d1c9671b0db5"

RPROVIDES:${PN} += "syslog-ng-geoip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
