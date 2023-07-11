SUMMARY = "Python driver for Cassandra"
DESCRIPTION = "A tunable Python client library for Apache Cassandra (1.2+) and \
DataStax Enterprise (3.1+) using exclusively Cassandra's binary \
protocol and Cassandra Query Language v3. \
A list of features may be found at https://github.com/datastax/python-driver#features ."
LICENSE = "Apache-2.0"

PV = "3.28.0"

RPM_NAME = "python39-cassandra-driver-3.28.0-1.1.aarch64.rpm"
RPM_HASH = "2e2a7af527b6250f4b90e112c562850b08c6d608d1b8201eb65e9e2be109fe98f72c1c381b53328f4b714313dae3ac6cb91b0efd1ca34a53fdb97391a9df0556"

RPROVIDES:${PN} += "python3.9dist-cassandra-driver \
python39-cassandra-driver \
python3dist-cassandra-driver"

RDEPENDS:${PN} += "python-abi \
python39-Cython \
python39-geomet \
python39-six"

inherit rpm
