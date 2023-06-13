SUMMARY = "Reader for the MaxMind DB format"
DESCRIPTION = "This is a Python module for reading MaxMind DB files. The module includes both \
a pure Python reader and an optional C extension. \
 \
MaxMind DB is a binary file format that stores data indexed by IP address \
subnets (IPv4 or IPv6)."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python311-maxminddb-2.2.0-3.1.aarch64.rpm"
RPM_HASH = "3d4e8727c2f38bd209d31b4a6ae26874c1a1ebaaa523132484d7159ec14af9776cd222788116c1c1c72662e429ad47b9ff8115df883f77820d5dcb58f0dea8b8"

RPROVIDES:${PN} += "python3.11dist(maxminddb) \
python311-maxminddb \
python311-maxminddb(aarch-64) \
python3dist(maxminddb)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmaxminddb.so.0()(64bit) \
python(abi)"

inherit rpm
