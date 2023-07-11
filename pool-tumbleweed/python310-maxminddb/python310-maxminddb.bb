SUMMARY = "Reader for the MaxMind DB format"
DESCRIPTION = "This is a Python module for reading MaxMind DB files. The module includes both \
a pure Python reader and an optional C extension. \
 \
MaxMind DB is a binary file format that stores data indexed by IP address \
subnets (IPv4 or IPv6)."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python310-maxminddb-2.2.0-3.3.aarch64.rpm"
RPM_HASH = "2bf047414537ef9789239208936b04190480dc679651801e4a3c6787034fb3d83dfb1f771597b7ba7d34690327543c7001f419e22a135afad720f4055e9a2caf"

RPROVIDES:${PN} += "python3.10dist-maxminddb \
python310-maxminddb \
python3dist-maxminddb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
python-abi"

inherit rpm
