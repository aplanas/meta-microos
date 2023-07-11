SUMMARY = "Python driver for Cassandra"
DESCRIPTION = "A tunable Python client library for Apache Cassandra (1.2+) and \
DataStax Enterprise (3.1+) using exclusively Cassandra's binary \
protocol and Cassandra Query Language v3. \
A list of features may be found at https://github.com/datastax/python-driver#features ."
LICENSE = "Apache-2.0"

PV = "3.28.0"

RPM_NAME = "python311-cassandra-driver-3.28.0-1.1.aarch64.rpm"
RPM_HASH = "8ea16acc378b3bd0443e3c6184f34a5a8b0a45b8e203c67e41381d1faf0d3b574b9e65b725a37ef382aae7b79213601cc1e70ed8fcc4bb90d7cd569d37406116"

RPROVIDES:${PN} += "python3-cassandra-driver \
python3.11dist-cassandra-driver \
python311-cassandra-driver \
python3dist-cassandra-driver"

RDEPENDS:${PN} += "python-abi \
python311-Cython \
python311-geomet \
python311-six"

inherit rpm
