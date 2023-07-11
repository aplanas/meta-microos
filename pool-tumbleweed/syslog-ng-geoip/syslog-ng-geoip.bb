SUMMARY = "GeoIP (MaxMindDB) support for syslog-ng"
DESCRIPTION = "This package provides GeoIP (MaxMindDB) modules providing support for \
logging geo-location information."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-geoip-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "50305a4728d7df2d39375a580155a9b4bfd5ccdb60e39afc74d781c0c2472337133a4b0096cea7a686eb5694c843851ada5a5c333d9f4bed49e1e81343f8ecba"

RPROVIDES:${PN} += "syslog-ng-geoip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
