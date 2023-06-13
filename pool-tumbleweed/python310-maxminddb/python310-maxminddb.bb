SUMMARY = "Reader for the MaxMind DB format"
DESCRIPTION = "This is a Python module for reading MaxMind DB files. The module includes both \
a pure Python reader and an optional C extension. \
 \
MaxMind DB is a binary file format that stores data indexed by IP address \
subnets (IPv4 or IPv6)."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python310-maxminddb-2.2.0-3.1.aarch64.rpm"
RPM_HASH = "d05a87774e20c70f2a99de60a00ceee2c95cf09210e2454c15caa47b97655736ff9c6022a9c638cfe58963fbee83e855c7ae69977a5eb32b037e832454f3dcc8"

RPROVIDES:${PN} += "python3-maxminddb \
python3.10dist(maxminddb) \
python310-maxminddb \
python310-maxminddb(aarch-64) \
python3dist(maxminddb)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmaxminddb.so.0()(64bit) \
python(abi)"

inherit rpm
