SUMMARY = "Python driver for Cassandra"
DESCRIPTION = "A tunable Python client library for Apache Cassandra (1.2+) and \
DataStax Enterprise (3.1+) using exclusively Cassandra's binary \
protocol and Cassandra Query Language v3. \
A list of features may be found at https://github.com/datastax/python-driver#features ."
LICENSE = "Apache-2.0"

PV = "3.28.0"

RPM_NAME = "python310-cassandra-driver-3.28.0-1.1.aarch64.rpm"
RPM_HASH = "853c29149019357d453541bd914122535e44642b4fabb1f36707d73ee15ef159a50d2675e5a920bc43e4b76b77dd748cb9d17b5348860bfa371403fb3949d816"

RPROVIDES:${PN} += "python3.10dist-cassandra-driver \
python310-cassandra-driver \
python3dist-cassandra-driver"

RDEPENDS:${PN} += "python-abi \
python310-Cython \
python310-geomet \
python310-six"

inherit rpm
