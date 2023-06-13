SUMMARY = "Python driver for Cassandra"
DESCRIPTION = "A tunable Python client library for Apache Cassandra (1.2+) and \
DataStax Enterprise (3.1+) using exclusively Cassandra's binary \
protocol and Cassandra Query Language v3. \
A list of features may be found at https://github.com/datastax/python-driver#features ."
LICENSE = "Apache-2.0"

PV = "3.26.0"

RPM_NAME = "python310-cassandra-driver-3.26.0-1.2.aarch64.rpm"
RPM_HASH = "78d2a9ce18bc5f6ff7bdb1d43de60c4522565cd43bc2657f5586b8fa1902b4a6adf49fb3b02a97059f3c5878b4a4fcd374dd04aeed8de8d7f9d90f709fc9290e"

RPROVIDES:${PN} += "python3-cassandra-driver \
python3.10dist(cassandra-driver) \
python310-cassandra-driver \
python310-cassandra-driver(aarch-64) \
python3dist(cassandra-driver)"

RDEPENDS:${PN} += "python(abi) \
python310-Cython \
python310-geomet \
python310-six"

inherit rpm
