SUMMARY = "LMDB backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the LMDB backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-lmdb-4.8.0-1.2.aarch64.rpm"
RPM_HASH = "c4d224df7be4591421079c756299bdda884e6115b4e4ed3eb0013d8ee285ac4f01743d47f137c166ed43b7446f3b53acb140afbd7f67231baa2a156016950589"

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
