SUMMARY = "Full-Featured Pure-Python Kafka Client"
DESCRIPTION = "PyKafka is a cluster-aware Kafka>=0.8.2 client for Python. It includes Python \
implementations of Kafka producers and consumers, which are optionally backed \
by a C extension built on `librdkafka`_, and runs under Python 2.7+, Python 3.4+, \
and PyPy. \
 \
.. _librdkafka: https://github.com/edenhill/librdkafka \
 \
PyKafka's primary goal is to provide a similar level of abstraction to the \
`JVM Kafka client`_ using idioms familiar to Python programmers and exposing \
the most Pythonic API possible."
LICENSE = "Apache-2.0"

PV = "2.8.0"

RPM_NAME = "python310-pykafka-2.8.0-2.21.aarch64.rpm"
RPM_HASH = "ccd5c57143a82d1f1681bb8a755cdcf6f48aec230ea70c773d2d6018bd8f29ab4118a3c492a511a3ff21181ab3f971626ec73356eb68a40b1aa1292f6d69c369"

RPROVIDES:${PN} += "python3-pykafka \
python3.10dist(pykafka) \
python310-pykafka \
python310-pykafka(aarch-64) \
python3dist(pykafka)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-gevent \
python310-kazoo \
python310-setuptools \
python310-six \
python310-tabulate"

inherit rpm
