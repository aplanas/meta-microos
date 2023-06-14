SUMMARY = "GeoIP backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the GeoIP backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-geoip-4.8.0-1.1.aarch64.rpm"
RPM_HASH = "b54898208d250b7d5ad3287f1d6a5a2b053fcd611b4afb4618b6973fafb28f43f899bc221fd51a7ce4ba6d37ea5d0fab5403f3dd720eb8a98ffe4ebbf01562d6"

RPROVIDES:${PN} += "libgeoipbackend.so \
pdns-backend-geoip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmaxminddb.so.0 \
libstdc++.so.6 \
libyaml-cpp.so.0.7 \
pdns"

inherit rpm
