SUMMARY = "GeoIP (MaxMindDB) support for syslog-ng"
DESCRIPTION = "This package provides GeoIP (MaxMindDB) modules providing support for \
logging geo-location information."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-geoip-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "3bc089123d43dec160208d4c96dfdc71f7e19e94ab3b510d44fd37284781b956db455357fcc0a27c602623d3dc2579c9c4c3233a1f3e735a5b801355b7b32c2a"

RPROVIDES:${PN} += "syslog-ng-geoip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
