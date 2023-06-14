SUMMARY = "LMDB backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the LMDB backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-lmdb-4.8.0-1.1.aarch64.rpm"
RPM_HASH = "963ed0fd64befd142da86aae95cded7c6978fe300ea09aef1973976c322d43ce912eb09b7511c5410bde0b7b70ae9190a952c5b455198eda948c616d143d7fa0"

RPROVIDES:${PN} += "liblmdbbackend.so \
pdns-backend-lmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-serialization.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
liblmdb-0.9.30.so \
libstdc++.so.6 \
pdns"

inherit rpm
