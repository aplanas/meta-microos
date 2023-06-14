SUMMARY = "GeoIP (MaxMindDB) support for syslog-ng"
DESCRIPTION = "This package provides GeoIP (MaxMindDB) modules providing support for \
logging geo-location information."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-geoip-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "b296d710c24bbcca0b0b3fd3c4eb0dca813cce03bfe3debc203618c331ed2b32cd1c7795a62919b7b68f924e809b8b25aec6386d2658dcc6c709fc48def1523e"

RPROVIDES:${PN} += "syslog-ng-geoip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
