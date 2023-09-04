SUMMARY = "GeoIP backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the GeoIP backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-geoip-4.8.0-1.2.aarch64.rpm"
RPM_HASH = "05ff5b9d3e33ee9a407f1d4efd82c3f0dcc25f4ca79a32104cf988ab5e3690a9746debbae9444f3dcbe5e8f5959369d05e921dad359df4e73fc7e2f8d8d125c4"

RPROVIDES:${PN} += "libgeoipbackend.so \
pdns-backend-geoip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmaxminddb.so.0 \
libstdc++.so.6 \
libyaml-cpp.so.0.8 \
pdns"

inherit rpm
