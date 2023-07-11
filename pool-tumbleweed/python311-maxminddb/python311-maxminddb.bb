SUMMARY = "Reader for the MaxMind DB format"
DESCRIPTION = "This is a Python module for reading MaxMind DB files. The module includes both \
a pure Python reader and an optional C extension. \
 \
MaxMind DB is a binary file format that stores data indexed by IP address \
subnets (IPv4 or IPv6)."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python311-maxminddb-2.2.0-3.3.aarch64.rpm"
RPM_HASH = "bfad7b096ab729b5d881ad950dcd23b783288ff935785df428fbb655708705c8cb01ddcdbe80e847995adf76761a6820d33756c7ca1c9d9249587eeb403b951b"

RPROVIDES:${PN} += "python3-maxminddb \
python3.11dist-maxminddb \
python311-maxminddb \
python3dist-maxminddb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
python-abi"

inherit rpm
