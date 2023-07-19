SUMMARY = "GeoIP (MaxMindDB) support for syslog-ng"
DESCRIPTION = "This package provides GeoIP (MaxMindDB) modules providing support for \
logging geo-location information."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-geoip-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "b20f60f5de8e5bcb2fb854addcecb980b98b65fa628283d34109a5d554f893ddd8420d16affc6f8086bdd548d168a5354e6b1e24e91e20cc2577deca2613f581"

RPROVIDES:${PN} += "syslog-ng-geoip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
