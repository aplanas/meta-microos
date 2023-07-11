SUMMARY = "Reader for the MaxMind DB format"
DESCRIPTION = "This is a Python module for reading MaxMind DB files. The module includes both \
a pure Python reader and an optional C extension. \
 \
MaxMind DB is a binary file format that stores data indexed by IP address \
subnets (IPv4 or IPv6)."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python39-maxminddb-2.2.0-3.3.aarch64.rpm"
RPM_HASH = "49b951e6eb89fcefc70ed6570f1f37318139ef16b94f2a72e5a2a698feaa7f6f2579de0cd8c8c14de5c4bf3c409b1b67b0e24024d2f4ee133cd7c99cfba4c436"

RPROVIDES:${PN} += "python3.9dist-maxminddb \
python39-maxminddb \
python3dist-maxminddb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
python-abi"

inherit rpm
